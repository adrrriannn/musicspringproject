package com.london.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.london.spring.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
