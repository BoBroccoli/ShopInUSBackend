package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.poji.Lotion;
import com.example.demo.poji.Luxury;

@Repository
public interface LuxuryRepository extends JpaRepository<Luxury,Integer>{

}
