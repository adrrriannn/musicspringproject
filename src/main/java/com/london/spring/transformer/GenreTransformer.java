package com.london.spring.transformer;

import com.london.spring.domain.Genre;
import com.london.spring.dto.GenreDTO;

public class GenreTransformer implements Transformer<Genre, GenreDTO>{

	public GenreDTO Entity2EntityDTO(Genre entity) {
		
		GenreDTO genreDTO = new GenreDTO();
		
		genreDTO.setId(entity.getId());
		genreDTO.setName(entity.getName());
		
		return genreDTO;
	}

	public Genre EntityDTO2Entity(GenreDTO entityDTO) {

		Genre genre = new Genre();
		
		genre.setId(entityDTO.getId());
		genre.setName(entityDTO.getName());
		
		return null;
	}
}