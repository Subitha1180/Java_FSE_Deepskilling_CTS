 
package com.example.countryapp.service;

import com.example.countryapp.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> getAllCountries();
    Optional<Country> getCountryById(Long id);
    Country createCountry(Country country);
    Country updateCountry(Long id, Country country);
    void deleteCountry(Long id);
}
