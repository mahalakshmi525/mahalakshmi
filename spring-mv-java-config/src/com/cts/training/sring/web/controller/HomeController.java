package com.cts.training.sring.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "home-page";
		
}
	@RequestMapping(value = {"/index","/home","/base"})
	public String index() {
		return "index-page";
	}
}