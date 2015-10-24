package com.london.spring.transformer;

import com.london.spring.domain.Concert;
import com.london.spring.dto.ConcertDTO;

public class ConcertTransformer implements Transformer<Concert, ConcertDTO> {

	public ConcertDTO Entity2EntityDTO(Concert entity) {
		ConcertDTO concertDTO = new ConcertDTO();

		concertDTO.setId(entity.getId());
		concertDTO.setArtist(entity.getArtist());
		concertDTO.setCity(entity.getCity());
		concertDTO.setName(entity.getName());
		concertDTO.setDescription(entity.getDescription());

		return concertDTO;
	}

	public Concert EntityDTO2Entity(ConcertDTO entityDTO) {
		Concert concert = new Concert();

		entityDTO.setId(concert.getId());
		entityDTO.setArtist(concert.getArtist());
		entityDTO.setCity(concert.getCity());
		entityDTO.setName(concert.getName());
		entityDTO.setDescription(concert.getDescription());

		return concert;
	}

}
