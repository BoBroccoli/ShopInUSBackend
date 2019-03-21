package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.poji.Cusmatic;
import com.example.demo.poji.Item;
import com.example.demo.poji.Monitor;
import com.example.demo.poji.Nike;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor,Integer>{

}
