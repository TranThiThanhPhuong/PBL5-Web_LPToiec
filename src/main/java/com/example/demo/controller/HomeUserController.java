package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HomeUserController {
	@RequestMapping("")
	public String home() {
		return "user/index";
	}
}
