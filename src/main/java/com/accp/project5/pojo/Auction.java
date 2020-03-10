package com.accp.project5.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Auction {
	@TableId(value = "auctionid", type = IdType.AUTO)
	private Integer auctionid;
	private String auctionname;
	private Integer auctionstartprice;
	private Integer auctionupset;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date auctionstarttime;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date auctionendtime;
	private String auctionpic;
	private String auctionpictype;
	private String auctiondesc;

	public Auction() {
		// TODO Auto-generated constructor stub
	}

	public Auction(Integer auctionid, String auctionname, Integer auctionstartprice, Integer auctionupset,
			Date auctionstarttime, Date auctionendtime, String auctionpic, String auctionpictype, String auctiondesc) {
		super();
		this.auctionid = auctionid;
		this.auctionname = auctionname;
		this.auctionstartprice = auctionstartprice;
		this.auctionupset = auctionupset;
		this.auctionstarttime = auctionstarttime;
		this.auctionendtime = auctionendtime;
		this.auctionpic = auctionpic;
		this.auctionpictype = auctionpictype;
		this.auctiondesc = auctiondesc;
	}

	public Integer getAuctionid() {
		return auctionid;
	}

	public void setAuctionid(Integer auctionid) {
		this.auctionid = auctionid;
	}

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

	public Integer getAuctionupset() {
		return auctionupset;
	}

	public void setAuctionupset(Integer auctionupset) {
		this.auctionupset = auctionupset;
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

	public String getAuctionpic() {
		return auctionpic;
	}

	public void setAuctionpic(String auctionpic) {
		this.auctionpic = auctionpic;
	}

	public String getAuctionpictype() {
		return auctionpictype;
	}

	public void setAuctionpictype(String auctionpictype) {
		this.auctionpictype = auctionpictype;
	}

	public String getAuctiondesc() {
		return auctiondesc;
	}

	public void setAuctiondesc(String auctiondesc) {
		this.auctiondesc = auctiondesc;
	}

}
