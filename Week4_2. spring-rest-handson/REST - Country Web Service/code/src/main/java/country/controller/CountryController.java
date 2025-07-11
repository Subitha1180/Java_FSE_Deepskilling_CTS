package com.example.country.controller;

import com.example.country.model.Country;
import com.example.country.data.CountryData;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        return new Country("IN", "India", "New Delhi");
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return CountryData.getAllCountries();
    }

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return CountryData.getCountryByCode(code);
    }
}
