package com.lsio.springboot.controllers;

import com.lsio.springboot.entities.City;
import com.lsio.springboot.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HomeController {

    @Autowired
    CityService cityService;

    @GetMapping("/getcities")
    public List<City> getcities(){
        return cityService.getCities();
    }

    @GetMapping
    public String testString(){
        return"test";
    }
}
