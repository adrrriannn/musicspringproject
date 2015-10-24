package com.london.spring.transformer;

import com.london.spring.domain.Country;
import com.london.spring.dto.CountryDTO;

public class CountryTransformer implements Transformer<Country, CountryDTO>{

	public CountryDTO Entity2EntityDTO(Country entity) {
		
		CountryDTO countryDTO = new CountryDTO();
		
		countryDTO.setId(entity.getId());
		countryDTO.setName(entity.getName());
		countryDTO.setCities(entity.getCities());
		
		return countryDTO;
	}

	public Country EntityDTO2Entity(CountryDTO entityDTO) {
		
		Country country = new Country();
		
		country.setId(entityDTO.getId());
		country.setName(entityDTO.getName());
		country.setCities(entityDTO.getCities());
		
		return country;
	}
}
