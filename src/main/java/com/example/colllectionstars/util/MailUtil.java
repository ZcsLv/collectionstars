package com.example.colllectionstars.util;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.Map;

/**
 * @description:通过邮箱发送激活信息
 * @author:zcs
 * @date:2019-06-16 21:14
 */

public class MailUtil {

   /**
    * @description:
    * @param:
    * @return:
    * @author:zcs
    * @date:
   */ 
    public  String createTemplates( Map<String,String> dataMap, String templateName, TemplateEngine templateEngine){
        //context 对象用于注入要在模板上渲染的信息
        Context context = new Context();
        context.setVariables();
        String emailText = templateEngine.process("emailTemplates",context);
        System.out.println(emailText);

        //返回模板源代码 String 类型
        return emailText;

    }
}
