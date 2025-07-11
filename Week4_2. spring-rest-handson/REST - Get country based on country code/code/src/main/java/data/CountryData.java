package com.example.country.data;

import com.example.country.model.Country;
import java.util.ArrayList;
import java.util.List;

public class CountryData {
    private static List<Country> countries = new ArrayList<>();

    static {
        countries.add(new Country("IN", "India", "New Delhi"));
        countries.add(new Country("US", "United States", "Washington D.C."));
        countries.add(new Country("JP", "Japan", "Tokyo"));
    }

    public static List<Country> getAllCountries() {
        return countries;
    }

    public static Country getCountryByCode(String code) {
        return countries.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElse(null);
    }
}
