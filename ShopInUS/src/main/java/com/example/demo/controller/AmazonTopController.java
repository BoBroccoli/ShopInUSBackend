package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.AmazonTop;
import com.example.demo.poji.Lotion;
import com.example.demo.poji.Nike;
import com.example.demo.repository.AmazonHotRepository;
import com.example.demo.repository.LotionRepository;
import com.example.demo.repository.NikeRepository;

@RestController
public class AmazonTopController {

	@Autowired
	private AmazonHotRepository amazonHotRepository;
	
    @RequestMapping("/api/hot")
    public ResponseEntity<List<AmazonTop>> index() {
    	List<AmazonTop> items = (List<AmazonTop>) amazonHotRepository.findAll();
        return new ResponseEntity<List<AmazonTop>>(items, HttpStatus.OK);
    
    }
}
