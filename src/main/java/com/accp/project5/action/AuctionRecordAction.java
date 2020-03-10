package com.accp.project5.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.project5.biz.AuctionRecordBiz;
import com.accp.project5.pojo.Auctionrecord;

@RestController
@RequestMapping("/api/auctionrecord")
public class AuctionRecordAction {
	@Autowired
	private AuctionRecordBiz biz;

	/**
	 * 新增拍卖记录
	 * 
	 * @param record
	 * @return
	 */
	@PostMapping
	public Map<String, Object> addUser(@RequestBody Auctionrecord record) {
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
