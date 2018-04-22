package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value= {"/hello","/hi"})
public class HelloCtrler {
	
	@RequestMapping(method=RequestMethod.GET)	
	public String say() {
		return "say   hi baby~~~~!";
	}
	@GetMapping(value="/spe")	
	public String speak() {
		return "speak   hi baby~~~~!";
	}
	
}
