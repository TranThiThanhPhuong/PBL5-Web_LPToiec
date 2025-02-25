package com.example.demo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String user() {
        return "user/index";
    }

    @RequestMapping("/profile")
    public String userProfile() {
        return "user/profile-user";
    }
}
