package com.accp.project5.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class AuctionRecordVo {
	private Integer id;
	private Integer auctionid;
	private Integer userid;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date auctiontime;
	private Integer auctionprice;
	private String username;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuctionid() {
		return auctionid;
	}

	public void setAuctionid(Integer auctionid) {
		this.auctionid = auctionid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getAuctiontime() {
		return auctiontime;
	}

	public void setAuctiontime(Date auctiontime) {
		this.auctiontime = auctiontime;
	}

	public Integer getAuctionprice() {
		return auctionprice;
	}

	public void setAuctionprice(Integer auctionprice) {
		this.auctionprice = auctionprice;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
