package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.Lotion;
import com.example.demo.poji.Luxury;
import com.example.demo.poji.Nike;
import com.example.demo.repository.LotionRepository;
import com.example.demo.repository.LuxuryRepository;
import com.example.demo.repository.NikeRepository;

@RestController
public class LuxuryController {

	@Autowired
	private LuxuryRepository luxuryRepository;
	
    @RequestMapping("/api/luxury")
    public ResponseEntity<List<Luxury>> index() {
    	List<Luxury> items = (List<Luxury>) luxuryRepository.findAll();
        return new ResponseEntity<List<Luxury>>(items, HttpStatus.OK);
    
    }
}
