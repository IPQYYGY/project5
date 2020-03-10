package com.accp.project5.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Auctionuser {
	@TableId(value = "userid", type = IdType.AUTO)
	private Integer userid;
	private String username;
	private String userpassword;
	private String usercardno;
	private String usertel;
	private String useraddress;
	private String userpostnumber;
	private Integer userisadmin;
	private String userquestion;
	private String useranswer;

	public Auctionuser() {
		// TODO Auto-generated constructor stub
	}

	public Auctionuser(Integer userid, String username, String userpassword, String usercardno, String usertel,
			String useraddress, String userpostnumber, Integer userisadmin, String userquestion, String useranswer) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.usercardno = usercardno;
		this.usertel = usertel;
		this.useraddress = useraddress;
		this.userpostnumber = userpostnumber;
		this.userisadmin = userisadmin;
		this.userquestion = userquestion;
		this.useranswer = useranswer;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsercardno() {
		return usercardno;
	}

	public void setUsercardno(String usercardno) {
		this.usercardno = usercardno;
	}

	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUserpostnumber() {
		return userpostnumber;
	}

	public void setUserpostnumber(String userpostnumber) {
		this.userpostnumber = userpostnumber;
	}

	public Integer getUserisadmin() {
		return userisadmin;
	}

	public void setUserisadmin(Integer userisadmin) {
		this.userisadmin = userisadmin;
	}

	public String getUserquestion() {
		return userquestion;
	}

	public void setUserquestion(String userquestion) {
		this.userquestion = userquestion;
	}

	public String getUseranswer() {
		return useranswer;
	}

	public void setUseranswer(String useranswer) {
		this.useranswer = useranswer;
	}
}
