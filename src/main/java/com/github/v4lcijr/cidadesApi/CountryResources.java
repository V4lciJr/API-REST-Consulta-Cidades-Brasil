package com.github.v4lcijr.cidadesApi;

import com.github.v4lcijr.cidadesApi.countries.Country;
import com.github.v4lcijr.cidadesApi.exceptions.CountryNotFoundExceptions;
import com.github.v4lcijr.cidadesApi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/countries")
public class CountryResources {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){

        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Country countryById(@PathVariable Long id) throws CountryNotFoundExceptions {
        return verifyByExists(id);
    }

    private Country verifyByExists(Long id) throws CountryNotFoundExceptions{
        return repository.findById(id).orElseThrow(() -> new CountryNotFoundExceptions(id));
    }
}
