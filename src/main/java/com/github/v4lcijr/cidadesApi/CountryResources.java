package com.github.v4lcijr.cidadesApi;

import com.github.v4lcijr.cidadesApi.countries.Country;
import com.github.v4lcijr.cidadesApi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResources {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){

        return repository.findAll();
    }
}
