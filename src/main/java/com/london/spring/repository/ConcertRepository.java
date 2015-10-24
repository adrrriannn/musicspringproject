package com.london.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.london.spring.domain.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long>{

}
