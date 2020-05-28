package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.entity.Heatlh;
import com.cg.demo.entity.Login;
import com.cg.demo.exception.HealthException;
import com.cg.demo.service.HealthService;



@RestController
@CrossOrigin("*")
public class HealthController {
	@Autowired
	HealthService  healthService;
	
	@GetMapping("admin/login/{user}/{pass}")
	public ResponseEntity<Login>  findUserLogin(@PathVariable("user") String username, @PathVariable("pass") String password) throws HealthException
	{
	  
		 Login log = healthService.findUser(username,password);
		 if(log==null) {
			 throw new HealthException("Login not successful");
		 }
		 return new ResponseEntity<>(log,HttpStatus.OK);
		
		
	}
	
	
	
	
	@GetMapping("center")
	public ResponseEntity<List<Heatlh>>  findAllCenters()
	{
	  
		List<Heatlh> list = healthService.findAllCenters();
		ResponseEntity<List<Heatlh>>  rt = new ResponseEntity<List<Heatlh>>(list,HttpStatus.OK);
		return rt;
		
	}
	
	@GetMapping("center/{id}")
	public  ResponseEntity<Heatlh>  findCenterById(@PathVariable("id") int centerId) throws  Exception
	{
		
		Heatlh hea = healthService.findCenterById(centerId);
		ResponseEntity<Heatlh>  rt = null;
		
		if(hea!=null)
		{
			rt= new ResponseEntity<Heatlh>(hea,HttpStatus.OK);
		}
		else
		{
			rt=new ResponseEntity<Heatlh>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}
	@PutMapping("center")
	public  ResponseEntity<Heatlh>  updateCenterById(@RequestBody Heatlh hea) throws  Exception
	{
		ResponseEntity<Heatlh>  rt = null;
		
		if(hea!=null)
		{
			hea= healthService.updateCenterById(hea);
			rt= new ResponseEntity<Heatlh>(hea,HttpStatus.OK);
		}
		else
		{
			rt=new ResponseEntity<Heatlh>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}
	
	@DeleteMapping("center/{id}")
	public  ResponseEntity<Heatlh>  deleteCenterById(@PathVariable("id") int centerId) throws Exception
	{
		
		Heatlh  hea = healthService.findCenterById(centerId);
		ResponseEntity<Heatlh>  rt = null;
		
		if(hea!=null)
		{
			hea = healthService.deleteCenterById(centerId);
			rt= new ResponseEntity<Heatlh>(hea,HttpStatus.OK);
		}
		else
		{
			rt=new ResponseEntity<Heatlh>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}
	
	@PostMapping("center")
	public ResponseEntity<Heatlh>  createCenter(@RequestBody Heatlh hea)
	{
		Heatlh hea1= healthService.addCenter(hea);
		   ResponseEntity<Heatlh> rt= new ResponseEntity<Heatlh>(hea1,HttpStatus.OK);
		   return rt;
	}
	
}

	
	
	
	
	
	
	

