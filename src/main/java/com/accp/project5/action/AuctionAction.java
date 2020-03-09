package com.accp.project5.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.project5.biz.AuctionBiz;
import com.accp.project5.pojo.Auction;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/auction")
public class AuctionAction {
	@Autowired
	private AuctionBiz biz;

	/**
	 * 查询所有并分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Auction> queryByPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.findBypage(pageNum, pageSize);
	}

	/**
	 * 新增拍卖品
	 * 
	 * @param auction
	 * @return
	 */
	@PostMapping
	public Map<String, Object> addAuction(@RequestBody Auction auction) {
		int i = biz.addAuction(auction);
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

	/**
	 * 修改拍卖品
	 * 
	 * @param auction
	 * @return
	 */
	@PutMapping
	public Map<String, Object> updateAuction(@RequestBody Auction auction) {
		int i = biz.modifyAuction(auction);
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

	/**
	 * 删除拍卖品
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public Map<String, Object> deleteAuction(@PathVariable Integer id) {
		int i = biz.removeAuction(id);
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
