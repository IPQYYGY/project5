package com.accp.project5.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.project5.biz.AuctionBiz;

@RestController
@RequestMapping("/api/auction")
public class AuctionAction {
	@Autowired
	private AuctionBiz bzi;
}
