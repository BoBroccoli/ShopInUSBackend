package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.poji.Item;
import com.example.demo.poji.Nike;
import com.example.demo.poji.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Integer>{

}
