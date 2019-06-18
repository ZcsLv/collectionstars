package com.example.colllectionstars.controller;

import com.example.colllectionstars.domain.Table_user;
import com.example.colllectionstars.service.MailServiceImp;
import com.example.colllectionstars.service.UserService;
import com.example.colllectionstars.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.UUID;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImp userService;

    @Autowired
    private MailServiceImp  mailServiceImp;


    @RequestMapping("/testReg")
    public String reg(@Validated Table_user user, BindingResult result, @RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("email")String email) {



        if (result.hasErrors()) {
            for (ObjectError error : result.getAllErrors()) {
                System.out.println( error.getDefaultMessage() );
                return "toRegister";
            }
        }
//        激活用户
            userService.encrytedPassword(user);//加密密码
            userService.insert(1,username,password,email,0,"第一次测试成功了了",new Date(  ) );
            System.out.println( "插入成功" );

//      提示用户激活账户
        String url=
        return "redirect:active";
    }
}
