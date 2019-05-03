package com.kids.creatives.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="street_number")
	private String unitStreet;
	
	@Column(name="suburb")
	private String suburb;
	
	@Column(name="city")
	private String city;
	
	@Column(name="area_code")
	private int areaCode;
	
	@OneToOne(mappedBy="address", fetch=FetchType.LAZY)
	private Parents parent;
	
	
	
	public Address() {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnitStreet() {
		return unitStreet;
	}

	public void setUnitStreet(String unitStreet) {
		this.unitStreet = unitStreet;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	
	public Parents getParent() {
		return parent;
	}


	public void setParent(Parents parent) {
		this.parent = parent;
	}

}
