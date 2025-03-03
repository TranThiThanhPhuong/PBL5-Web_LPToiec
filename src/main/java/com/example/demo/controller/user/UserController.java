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
    
    @RequestMapping("/vocal")
    public String userVocalbulary() {
        return "user/vocalbulary";
    }
    
    @RequestMapping("/gramm")
    public String userGrammar() {
        return "user/grammar";
    }
    
    @RequestMapping("/listen")
    public String userListening() {
        return "user/listeningcard";
    }
    
    @RequestMapping("/listenp1")
    public String userListeningPart1() {
        return "user/listeningpart1";
    }
    
    @RequestMapping("/listenp2")
    public String userListeningPart2() {
        return "user/listeningpart2";
    }
    
    @RequestMapping("/listenp3")
    public String userListeningPart3() {
        return "user/listeningpart3";
    }
    
    @RequestMapping("/listenp4")
    public String userListeningPart4() {
        return "user/listeningpart4";
    }
    
    @RequestMapping("/reading")
    public String userReading() {
        return "user/readingcard";
    }
    
    @RequestMapping("/readingp5")
    public String userReadingPart5() {
        return "user/readingpart5";
    }
    
    @RequestMapping("/readingp6")
    public String userReadingPart6() {
        return "user/readingpart6";
    }
    
    @RequestMapping("/readingp7")
    public String userReadingPart7() {
        return "user/readingpart7";
    }
}
