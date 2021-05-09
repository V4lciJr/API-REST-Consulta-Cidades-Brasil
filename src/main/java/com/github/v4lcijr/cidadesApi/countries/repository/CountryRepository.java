package com.github.v4lcijr.cidadesApi.countries.repository;

import com.github.v4lcijr.cidadesApi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
