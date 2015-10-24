package com.london.spring.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class City {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private Country country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
