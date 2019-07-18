package com.pccw.assessment.resource;


import com.pccw.assessment.notification.service.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/notification")
public class NotificationEndpointImpl {

    @Autowired
    private NotificationService notificationService;

    @ApiOperation(value = "Sending a notification request")
    @PostMapping(value = "")
    public ResponseEntity<String> notification(@RequestBody @NotNull String email) {
        notificationService.send(email);
        return ResponseEntity.status(HttpStatus.OK).body("Sending a notification successfully.");
    }
}
