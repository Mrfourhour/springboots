package com.xinyet.springbootshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @RequestMapping({"/","/index"})
    public String index(Model model){
        model.addAttribute("msg","hello shiro!");
        return "index";
    }
}
