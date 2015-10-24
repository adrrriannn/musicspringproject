package com.london.spring.transformer;

import com.london.spring.domain.City;
import com.london.spring.dto.CityDTO;

public class CityTransfomer implements Transformer<City, CityDTO>{

	public CityDTO Entity2EntityDTO(City entity) {
		
		CityDTO cityDTO = new CityDTO();
		
		cityDTO.setId(entity.getId());
		cityDTO.setName(entity.getName());
		cityDTO.setCountry(entity.getCountry());
		
		return cityDTO;
	}

	public City EntityDTO2Entity(CityDTO entityDTO) {
		
		City city = new City();
		
		city.setId(entityDTO.getId());
		city.setName(entityDTO.getName());
		city.setCountry(entityDTO.getCountry());
		
		return city;
	}
}
