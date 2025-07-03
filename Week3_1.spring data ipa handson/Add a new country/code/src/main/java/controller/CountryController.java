package com.example.countryapp.controller;

import com.example.countryapp.model.Country;
import com.example.countryapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        Optional<Country> result = countryRepository.findByCountryCode(code);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/capital/{capital}")
    public List<Country> getByCapital(@PathVariable String capital) {
        return countryRepository.findByCapital(capital);
    }

    @GetMapping("/search/{keyword}")
    public List<Country> searchByName(@PathVariable String keyword) {
        return countryRepository.findByNameContaining(keyword);
    }

    @GetMapping("/hql/{name}")
    public List<Country> getByNameHql(@PathVariable String name) {
        return countryRepository.getByNameHQL(name);
    }

    @GetMapping("/native/{capital}")
    public List<Country> getByCapitalNative(@PathVariable String capital) {
        return countryRepository.getByCapitalNative(capital);
    }
}
