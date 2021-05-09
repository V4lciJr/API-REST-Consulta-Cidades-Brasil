package com.github.v4lcijr.cidadesApi.cities.repository;

import com.github.v4lcijr.cidadesApi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
