package com.london.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.london.spring.domain.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long>{

}
