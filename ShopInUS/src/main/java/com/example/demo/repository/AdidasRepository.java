package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.poji.Adidas;
import com.example.demo.poji.Item;
import com.example.demo.poji.Nike;

@Repository
public interface AdidasRepository extends JpaRepository<Adidas,Integer>{

}
