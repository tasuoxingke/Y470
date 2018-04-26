package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookShopCtrler {
	@GetMapping("/")
	public String indexJump(Model m) {
		m.addAttribute("home","aa");
		return "index";
	}
}
