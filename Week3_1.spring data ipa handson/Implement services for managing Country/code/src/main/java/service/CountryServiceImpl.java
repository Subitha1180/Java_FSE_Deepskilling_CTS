 
package com.example.countryapp.service;

import com.example.countryapp.model.Country;
import com.example.countryapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> getCountryById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country updateCountry(Long id, Country updatedCountry) {
        return countryRepository.findById(id)
            .map(country -> {
                country.setName(updatedCountry.getName());
                country.setCapital(updatedCountry.getCapital());
                country.setPopulation(updatedCountry.getPopulation());
                return countryRepository.save(country);
            })
            .orElseThrow(() -> new RuntimeException("Country not found with ID: " + id));
    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
