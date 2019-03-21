package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.Item;
import com.example.demo.poji.Monitor;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.MonitorRepository;


@RestController
public class HelloController {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private MonitorRepository monitorRepository;
	
    @RequestMapping("/api")
    public ResponseEntity<List<Item>> index() {
    	List<Item> items = (List<Item>) itemRepository.findAll();
        return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
    
    }
    @RequestMapping("/moniter")
    public void save() {
    	
    	Monitor monitor = new Monitor("Hello from China");
    	
    	monitorRepository.save(monitor);
    
    }
}
