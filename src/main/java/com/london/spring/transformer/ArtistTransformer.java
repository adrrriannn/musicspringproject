package com.london.spring.transformer;

import com.london.spring.domain.Artist;
import com.london.spring.dto.ArtistDTO;

public class ArtistTransformer implements Transformer<Artist, ArtistDTO>{

	public ArtistDTO Entity2EntityDTO(Artist entity) {
		
		ArtistDTO artistDTO = new ArtistDTO();
		
		artistDTO.setId(entity.getId());
		artistDTO.setGenre(entity.getGenre());
		artistDTO.setName(entity.getName());
		
		return artistDTO;
	}

	public Artist EntityDTO2Entity(ArtistDTO entityDTO) {
		
		Artist artist = new Artist();
		
		artist.setId(entityDTO.getId());
		artist.setName(entityDTO.getName());
		artist.setGenre(entityDTO.getGenre());
		
		return null;
	}

}
