package com.example.demo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/include")
public class UserController {
	@RequestMapping("")
    public String user() {
        return "user/include/header-user";
    }
	
	@RequestMapping("/info")
	public String userInfo() {
		return "user/include/header-user-info";
	}
}