package com.pccw.assessment;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AssessmentNotificationApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AssessmentNotificationApplication.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
    }
}
