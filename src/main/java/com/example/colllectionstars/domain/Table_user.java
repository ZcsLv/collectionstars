package com.example.colllectionstars.domain;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "table_user")
public class Table_user{


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)//主键自增策略还有那些？？？？？怎么区分？？？
    private int user_id;

   @Size(min=1,max = 10,message = "用户名必须在1-10")
    private String user_nickname;

    @Size(min=1,max = 10,message = "密码必须在1-10")
    private String user_password;

    @Email(message = "邮箱格式错误")
    private String user_email;

    private int acti_state;

    private String acti_code;

    private Date token_exptime;

    private String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getActi_state() {
        return acti_state;
    }

    public void setActi_state(int acti_state) {
        this.acti_state = acti_state;
    }

    public String getActi_code() {
        return acti_code;
    }

    public void setActi_code(String acti_code) {
        this.acti_code = acti_code;
    }

    public Date getToken_exptime() {
        return token_exptime;
    }

    public void setToken_exptime(Date token_exptime) {
        this.token_exptime = token_exptime;
    }
}
