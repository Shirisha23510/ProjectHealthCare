package com.cg.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="center_tbl")


public class Heatlh {



	@Id
	@Column(name="centerid")
	private int centerId;
	@Column(name="centername",length=15)
	private String centerName;
	
	@Column(name="centerlocation",length=15)
	private String centerLocation ;

	@Column(name="centeraddress",length=15)
	private String centeraddress ;

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


