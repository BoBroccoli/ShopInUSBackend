package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.Nike;
import com.example.demo.repository.NikeRepository;

@RestController
public class NikeController {

	@Autowired
	private NikeRepository nikeRepository;
	
    @RequestMapping("/api/nike")
    public ResponseEntity<List<Nike>> index() {
    	List<Nike> items = (List<Nike>) nikeRepository.findAll();
        return new ResponseEntity<List<Nike>>(items, HttpStatus.OK);
    
    }
}
