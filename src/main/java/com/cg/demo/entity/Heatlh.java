package com.cg.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="center_tbl")


public class Heatlh {



	@Id
	@GeneratedValue(generator = "mygen1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "mygen1", sequenceName = "health_seq", allocationSize = 1)
	@Column(name="centerid")
	private int centerId;
	@Column(name="centername",length=20)
	private String centerName;
	
	@Column(name="centeraddress",length=20)
	private String centeraddress ;

	@Column(name="centerlocation",length=20)
	private String centerLocation ;


	

	public Heatlh() {
		super();
		
	}

	public Heatlh(int centerId, String centerName, String centeraddress, String centerLocation) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.centeraddress = centeraddress;
		this.centerLocation = centerLocation;
	}


	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterLocation() {
		return centerLocation;
	}

	public void setCenterLocation(String centerLocation) {
		this.centerLocation = centerLocation;
	}

	public String getCenteraddress() {
		return centeraddress;
	}

	public void setCenteraddress(String centeraddress) {
		this.centeraddress = centeraddress;
	}

}


