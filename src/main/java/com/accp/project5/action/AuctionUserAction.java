package com.accp.project5.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.project5.biz.AuctionUserBiz;
import com.accp.project5.pojo.AuctionUser;

@RestController
@RequestMapping("/api/auctionuser")
public class AuctionUserAction {
	@Autowired
	private AuctionUserBiz biz;

	/**
	 * 登录
	 */
	@GetMapping("/{name}/{pwd}")
	public String findLogin(String name, String pwd, Model model, HttpSession session) {
		AuctionUser user = biz.findLogin(name, pwd);
		if (user != null) {
			session.setAttribute("student", user);
			return "redirect:";
		} else {
			model.addAttribute("MSG", "用户名或密码错误");
			return "login";// 必须是模板文件名【转发】
		}
	}

	/**
	 * 注册用户
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping
	public Map<String, Object> insertUser(@RequestBody AuctionUser user) {
		int i = biz.addUser(user);
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
