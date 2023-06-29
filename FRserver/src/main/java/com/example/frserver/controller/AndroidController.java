package com.example.frserver.controller;

import com.example.frserver.service.AndroidService;
import com.example.frserver.service.StatisticService;
import com.example.frserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AndroidController {
    @Autowired
    AndroidService androidService;
    @Autowired
    UserService userService;

    @Autowired
    StatisticService statisticService;

    @GetMapping("/sendImage")
    public String get(){
        return androidService.giveMeFive();
    }

    @PostMapping("/postImage")
    public String post(){
        return "nice pic";
    }

    @GetMapping("/getUserCount")
    public long getCount(){
        return userService.getCount();
    }

    @PostMapping("/totalUsage")
    public void incrementTotalUsage() {
        statisticService.incrementTotalUsage();
    }
}
