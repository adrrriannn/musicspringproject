package com.london.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.london.spring.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{
	
}