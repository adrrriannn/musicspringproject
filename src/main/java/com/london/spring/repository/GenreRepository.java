package com.london.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.london.spring.domain.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}