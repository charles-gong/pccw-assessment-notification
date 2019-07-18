package com.pccw.assessment.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void send(String to) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("gonglongmin@outlook.com");
        msg.setTo(to);
        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);
    }
}
