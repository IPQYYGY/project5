package com.accp.project5.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.project5.dao.IAuctionrecordDao;
import com.accp.project5.pojo.Auction;
import com.accp.project5.pojo.Auctionrecord;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionRecordBiz {
	@Autowired
	private IAuctionrecordDao dao;

	/**
	 * 新增拍卖记录
	 * 
	 * @param record
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addAuction(Auctionrecord record) {
		return dao.insert(record);
	}

}
