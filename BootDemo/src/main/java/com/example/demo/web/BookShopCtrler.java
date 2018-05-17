package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookShopCtrler {
	/**
	 *首页跳转
	 *因为index.html文件不在项目目录下，直接访问项目地址是访问不到的
	 * @param m
	 * @return
	 */
	@GetMapping("/")
	public String indexJump(Model m) {
//		m.addAttribute("home","");
		return "index";
	}
}
