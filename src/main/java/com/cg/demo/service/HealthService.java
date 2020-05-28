package com.cg.demo.service;

import java.util.List;

import com.cg.demo.entity.Heatlh;
import com.cg.demo.entity.Login;
import com.cg.demo.exception.HealthException;




public interface HealthService {
	public Login findUser(String username , String password) throws HealthException;
	public  List<Heatlh>   findAllCenters();
	public  Heatlh  findCenterById(int centerId) throws HealthException ;
	public Heatlh  addCenter(Heatlh health);
	public  Heatlh  deleteCenterById(int centerId);
	public Heatlh updateCenterById(Heatlh health) throws HealthException;
}


