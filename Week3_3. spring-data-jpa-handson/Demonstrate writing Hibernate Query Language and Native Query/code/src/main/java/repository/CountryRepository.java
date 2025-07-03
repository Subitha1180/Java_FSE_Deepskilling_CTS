package com.example.countryapp.repository;

import com.example.countryapp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findByCountryCode(String countryCode);

    List<Country> findByCapital(String capital);
    List<Country> findByNameContaining(String keyword);
    List<Country> findByPopulationGreaterThan(long population);

    @Query("SELECT c FROM Country c WHERE c.name = :name")
    List<Country> getByNameHQL(@Param("name") String name);

    @Query(value = "SELECT * FROM country WHERE capital = :capital", nativeQuery = true)
    List<Country> getByCapitalNative(@Param("capital") String capital);
}
