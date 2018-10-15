package com.anthony.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Anthony on 2018/10/15
 */
@RestController
public class MailController {

    @Autowired
    private JavaMailSender jms;

    @RequestMapping("/sendMail")
    public String sendMail(){
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setTo("xxx@qq.com");
        smm.setFrom("xxx@126.com");
        smm.setSubject("springboot-mail-demo-test");
        smm.setText("this is from 126 mail for test");
        jms.send(smm);
        return "success";
    }
}
