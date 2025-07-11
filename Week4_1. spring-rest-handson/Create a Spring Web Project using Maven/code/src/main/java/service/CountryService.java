package com.example.country.service;

import com.example.country.model.Country;
import com.example.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryByCode(String code) {
        return countryRepository.findById(code);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> searchByNameHQL(String name) {
        return countryRepository.searchByNameHQL(name);
    }

    public List<Country> getByCapitalNative(String capital) {
        return countryRepository.findByCapitalNative(capital);
    }
}
