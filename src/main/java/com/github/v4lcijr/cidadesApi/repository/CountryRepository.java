package com.github.v4lcijr.cidadesApi.repository;

import com.github.v4lcijr.cidadesApi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
