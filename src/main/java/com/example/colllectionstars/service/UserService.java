package com.example.colllectionstars.service;

import com.example.colllectionstars.domain.Table_user;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public interface UserService {


   void insert(int id,String username,String password,String email,int state,String code,Date time);

   //加密用户密码
   Table_user encrytedPassword(Table_user table_user);

}
