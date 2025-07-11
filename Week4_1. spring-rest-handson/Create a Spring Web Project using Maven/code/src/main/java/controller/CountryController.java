package com.example.country.controller;

import com.example.country.model.Country;
import com.example.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{code}")
    public Optional<Country> getCountryByCode(@PathVariable String code) {
        return countryService.getCountryByCode(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @GetMapping("/search")
    public List<Country> searchByName(@RequestParam String name) {
        return countryService.searchByNameHQL(name);
    }

    @GetMapping("/capital")
    public List<Country> getByCapital(@RequestParam String capital) {
        return countryService.getByCapitalNative(capital);
    }
}
