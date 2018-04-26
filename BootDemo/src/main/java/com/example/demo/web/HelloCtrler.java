package com.example.demo.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping(value= {"/hello","/hi"})
public class HelloCtrler {
	
	@RequestMapping(method=RequestMethod.GET)
	public String say() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("index");
		return "index";
	}
	@ResponseBody
	@GetMapping(value="/spe")	
	public String speak() {
		return "speak   hi baby~~~~!";
	}
	
}
