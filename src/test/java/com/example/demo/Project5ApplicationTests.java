package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.project5.biz.AuctionBiz;

@SpringBootTest
class Project5ApplicationTests {
	@Autowired
	private AuctionBiz biz;

	@Test
	void contextLoads() {
     biz.findBypage(1,3);
	}

}
