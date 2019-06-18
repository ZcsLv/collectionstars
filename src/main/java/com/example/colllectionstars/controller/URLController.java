package com.example.colllectionstars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class URLController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }
    @RequestMapping("/toRegister")
    public String toRegister(){

        return "toRegister";
    }
}
