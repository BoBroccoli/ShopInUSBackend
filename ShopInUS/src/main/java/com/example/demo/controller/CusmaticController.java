package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.poji.Cusmatic;
import com.example.demo.poji.Nike;
import com.example.demo.repository.CusmaticRepository;
import com.example.demo.repository.NikeRepository;

@RestController
public class CusmaticController {

	@Autowired
	private CusmaticRepository cusmaticRepository;
	
    @RequestMapping("/api/cusmatic")
    public ResponseEntity<List<Cusmatic>> index() {
    	List<Cusmatic> items = (List<Cusmatic>) cusmaticRepository.findAll();
        return new ResponseEntity<List<Cusmatic>>(items, HttpStatus.OK);
    
    }
}
