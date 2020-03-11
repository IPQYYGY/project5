package com.accp.project5.biz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.project5.dao.IAuctionDao;
import com.accp.project5.pojo.Auction;
import com.accp.project5.vo.AuctionVo;
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
	 * 查询拍卖结束的拍卖纪录
	 * 
	 * @return
	 */
	public List<AuctionVo> findEnd() {
		return dao.queryEndList(new Date());
	}

	/**
	 * 查询正在拍卖的拍卖纪录
	 * 
	 * @return
	 */
	public List<AuctionVo> findStart() {
		return dao.queryStartList(new Date());
	}

	/**
	 * 具体查询
	 * 
	 * @param id
	 * @return
	 */
	public Auction findById(Integer id) {
		return dao.selectById(id);
	}

	/**
	 * 查询所有并分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Auction> findBypage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Auction> qw = Wrappers.query();
		qw.gt("auctionendtime", new Date());
		return new PageInfo<>(dao.selectList(qw));
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
		qw.gt("auctionendtime", new Date());
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
		return dao.delById(id);
	}
}
