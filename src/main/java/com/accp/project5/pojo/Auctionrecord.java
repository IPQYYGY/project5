package com.accp.project5.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Auctionrecord {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private Integer auctionid;
	private Integer userid;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date auctiontime;
	private Integer auctionprice;

	public Auctionrecord() {
		// TODO Auto-generated constructor stub
	}

	public Auctionrecord(Integer id, Integer auctionid, Integer userid, Date auctiontime, Integer auctionprice) {
		super();
		this.id = id;
		this.auctionid = auctionid;
		this.userid = userid;
		this.auctiontime = auctiontime;
		this.auctionprice = auctionprice;
	}

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

}
