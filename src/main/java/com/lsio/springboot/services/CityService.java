package com.lsio.springboot.services;

import com.lsio.springboot.entities.City;
import com.lsio.springboot.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public CityService(){}

    public List<City> getCities(){
        return cityRepository.findAll();
    }
}
