package com.cg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.demo.entity.Heatlh;



@Repository
public interface HealthDao extends JpaRepository<Heatlh, Integer>
{
	  
	  
}
