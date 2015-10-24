package com.london.spring.form;

import com.london.spring.domain.Genre;

public class ArtistForm {
	
	private Long id;
	
	private String name;
	
	private Genre genre;
	
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

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}
