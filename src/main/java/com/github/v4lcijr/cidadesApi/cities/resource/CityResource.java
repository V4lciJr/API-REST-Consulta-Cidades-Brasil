package com.github.v4lcijr.cidadesApi.cities.resource;

import com.github.v4lcijr.cidadesApi.cities.entities.City;
import com.github.v4lcijr.cidadesApi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page<City> cities(final Pageable page){
        return cityRepository.findAll(page);
    }
}
