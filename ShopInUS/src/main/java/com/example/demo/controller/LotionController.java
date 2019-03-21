package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.Lotion;
import com.example.demo.poji.Nike;
import com.example.demo.repository.LotionRepository;
import com.example.demo.repository.NikeRepository;

@RestController
public class LotionController {

	@Autowired
	private LotionRepository lotionRepository;
	
    @RequestMapping("/api/lotion")
    public ResponseEntity<List<Lotion>> index() {
    	List<Lotion> items = (List<Lotion>) lotionRepository.findAll();
        return new ResponseEntity<List<Lotion>>(items, HttpStatus.OK);
    
    }
}
