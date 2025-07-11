package com.example.country.repository;

import com.example.country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByName(String name);
    List<Country> findByCapital(String capital);

    @Query("SELECT c FROM Country c WHERE c.name LIKE %?1%")
    List<Country> searchByNameHQL(String keyword);

    @Query(value = "SELECT * FROM country WHERE capital = ?1", nativeQuery = true)
    List<Country> findByCapitalNative(String capital);
}
