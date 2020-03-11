package com.accp.project5.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.project5.biz.AuctionRecordBiz;
import com.accp.project5.pojo.Auctionrecord;
import com.accp.project5.pojo.Auctionuser;
import com.accp.project5.vo.AuctionRecordVo;

@RestController
@RequestMapping("/api/auctionrecord")
public class AuctionRecordAction {
	@Autowired
	private AuctionRecordBiz biz;

	/**
	 * 根据拍卖品编号查询出价记录
	 * 
	 * @param id
	 * @return
	 *
	 */
	@GetMapping("/{id}")
	public List<AuctionRecordVo> queryList(@PathVariable Integer id) {
		return biz.findList(id);
	}

	/**
	 * 新增拍卖记录
	 * 
	 * @param record
	 * @return
	 */
	@PostMapping
	public Map<String, Object> addUser(@RequestBody Auctionrecord record) {
		record.setAuctiontime(new Date());
		int i = biz.addAuction(record);
		Map<String, Object> message = new HashMap<String, Object>();
		if (i > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "400");
			message.put("msg", "no");
		}
		return message;
	}
}
