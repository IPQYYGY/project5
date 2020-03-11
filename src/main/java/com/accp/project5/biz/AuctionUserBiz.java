package com.accp.project5.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.project5.dao.IAuctionuserDao;
import com.accp.project5.pojo.Auctionuser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionUserBiz {
	@Autowired
	private IAuctionuserDao dao;

	/**
	 * 登录
	 */
	public Auctionuser findLogin(String name, String pwd,Integer type) {
		QueryWrapper<Auctionuser> qw = Wrappers.query();
		qw.eq("username", name).eq("userPassword", pwd).eq("userisadmin", type);
		return dao.selectOne(qw);
	}

	/**
	 * 注册用户
	 * 
	 * @param user
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addUser(Auctionuser user) {
		return dao.insert(user);
	}
}
