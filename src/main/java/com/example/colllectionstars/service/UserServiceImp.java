package com.example.colllectionstars.service;

import com.example.colllectionstars.domain.Table_user;
import com.example.colllectionstars.repository.UserRepository;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @description:
 * @author:zcs
 * @date:2019-06-16 19:26
 */

@Service
public class UserServiceImp implements UserService {

    @Autowired//为什么这里需要这个注释？？？是什么意思？？？？
    private UserRepository userRepository;

    //数据库里存的是datetime类型
    @Override
    public void insert(int id,String username,String password,String email,int state,String code,Date time) {
        userRepository.insert( id,username,password, email,state,code,time);
    }

    /**
     * 使用hash函数对密码进行加密处理
     * @param table_user
     * @return
     */
    @Override
    public Table_user encrytedPassword(Table_user table_user) {
        String salt= UUID.randomUUID().toString();
        //MD5Hash是属于shiro认证里的一个
        Md5Hash md5Hash=new Md5Hash(table_user.getUser_password(),salt);
        table_user.setUser_password(md5Hash.toString());
        table_user.setSalt(salt);
        return table_user;
    }
}
