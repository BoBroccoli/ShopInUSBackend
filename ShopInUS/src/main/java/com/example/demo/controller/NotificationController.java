package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.Notification;
import com.example.demo.repository.NotificationRepository;

@RestController
public class NotificationController {

	@Autowired
	private NotificationRepository notificationRepository;
	
    @RequestMapping("/api/notification")
    public Notification index() {
    	Optional<Notification>item = notificationRepository.findById(1);
    	System.out.println(item.get().getNotification());
        return item.get();
    
    }
}
