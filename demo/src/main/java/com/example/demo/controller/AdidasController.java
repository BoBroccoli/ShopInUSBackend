package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.Adidas;
import com.example.demo.poji.Item;
import com.example.demo.poji.Nike;
import com.example.demo.repository.AdidasRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.NikeRepository;

@RestController
public class AdidasController {

	@Autowired
	private AdidasRepository adidasRepository;
	
    @RequestMapping("/api/adidas")
    public ResponseEntity<List<Adidas>> index() {
    	List<Adidas> items = (List<Adidas>) adidasRepository.findAll();
        return new ResponseEntity<List<Adidas>>(items, HttpStatus.OK);
    
    }
}
