package com.accp.project5.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class AuctionVo {
	private String auctionname;
	private Integer auctionstartprice;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date auctionstarttime;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date auctionendtime;
	private Integer auctionprice;
	private String username;
	private List<AuctionRecordVo> record = new ArrayList<AuctionRecordVo>(0);

	public String getAuctionname() {
		return auctionname;
	}

	public void setAuctionname(String auctionname) {
		this.auctionname = auctionname;
	}

	public Integer getAuctionstartprice() {
		return auctionstartprice;
	}

	public void setAuctionstartprice(Integer auctionstartprice) {
		this.auctionstartprice = auctionstartprice;
	}

	public Date getAuctionstarttime() {
		return auctionstarttime;
	}

	public void setAuctionstarttime(Date auctionstarttime) {
		this.auctionstarttime = auctionstarttime;
	}

	public Date getAuctionendtime() {
		return auctionendtime;
	}

	public void setAuctionendtime(Date auctionendtime) {
		this.auctionendtime = auctionendtime;
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

	public List<AuctionRecordVo> getRecord() {
		return record;
	}

	public void setRecord(List<AuctionRecordVo> record) {
		this.record = record;
	}
}
