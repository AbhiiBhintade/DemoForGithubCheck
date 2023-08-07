package com.example.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String prelogin()
	{
		return "WELCOME!!!!";
	}
	
	

}