package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.dao.HealthDao;
import com.cg.demo.entity.Heatlh;
import com.cg.demo.exception.HealthException;

@Service
public class HealthServiceImpl implements HealthService{

	
	 @Autowired
	   HealthDao  healthDao;
	@Override
	public List<Heatlh> findAllCenters() {
       List<Heatlh> list = healthDao.findAll();
		
		return list;	
	}

	@Override
	public Heatlh findCenterById(int centerId) throws HealthException {

		Heatlh hee = null;
		if( healthDao.existsById(centerId))
		{
			hee = healthDao.findById(centerId).get();
		}
		else
		{
			throw new HealthException(centerId+ " ID NOT FOUND ");
		}
		return hee;
	}

	@Override
	public Heatlh addCenter(Heatlh health) {
		healthDao.saveAndFlush(health);
		return health;
	}


	@Override
	public Heatlh deleteCenterById(int centerId) {
  Heatlh  hee =null;
		
		if( healthDao.existsById(centerId))
		{
			 hee = healthDao.findById(centerId).get();
			 healthDao.deleteById(centerId);
		}
		return hee ;
	}

	@Override
	public Heatlh updateCenterById(Heatlh health) throws HealthException {

		int centerId = health.getCenterId();
		if( healthDao.existsById(centerId))
		{
			 Heatlh he = healthDao.findById(centerId).get();
			 healthDao.saveAndFlush(health);
		}
		else
		{
			throw new HealthException("Id not found");
		}
		return health ;
	}

	
}
