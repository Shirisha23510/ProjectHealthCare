package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.demo.dao.HealthDao;
import com.cg.demo.entity.Heatlh;
import com.cg.demo.exception.HealthException;
import com.cg.demo.service.HealthService;

@SpringBootTest
class HealthApplicationTests {

	
 @Autowired 
 private HealthService service;
 @MockBean
private HealthDao healthdao;
	
	@Test
	void contextLoads() {
	}
   
	
	@Test
	public void Health() throws HealthException{
		when(healthdao.findAll()).thenReturn(Stream.of(new Heatlh(61,"tesla","Karnatka","bidar"),new Heatlh(61,"Apollo","hyderabad","HitechCity")).collect(Collectors.toList()));
		assertEquals(2,service.findAllCenters().size());
		}
		
	{
		
	}
}
