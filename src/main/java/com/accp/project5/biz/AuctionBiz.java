package com.accp.project5.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.project5.dao.IAuctionDao;
import com.accp.project5.pojo.Auction;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionBiz {
	@Autowired
	private IAuctionDao dao;

	/**
	 * 查询所有并分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Auction> findBypage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.selectList(null));
	}

	/**
	 * 根据查询所有并分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Auction> findBypages(Integer pageNum, Integer pageSize, String shoppingname, String shoppingdes,
			String startdata, String enddata, Integer price) {
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Auction> qw = Wrappers.query();
		if (!shoppingname.equals("null")) {
			qw.like("auctionname", shoppingname);
		}
		if (!shoppingdes.equals("null")) {
			qw.like("auctiondesc", shoppingdes);
		}
		if (!startdata.equals("null")) {
			qw.gt("auctionstarttime", startdata);
		}
		if (!enddata.equals("null")) {
			qw.lt("auctionendtime", enddata);
		}
		if (price != -1) {
			qw.eq("auctionstartprice", price);
		}
		return new PageInfo<>(dao.selectList(qw));
	}

	/**
	 * 新增拍卖品
	 * 
	 * @param auction
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addAuction(Auction auction) {
		return dao.insert(auction);
	}

	/**
	 * 修改拍卖品
	 * 
	 * @param auction
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyAuction(Auction auction) {
		return dao.updateById(auction);
	}

	/**
	 * 删除拍卖品
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeAuction(Integer id) {
		return dao.deleteById(id);
	}
}
