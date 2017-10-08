package com.smk.bi.ticketing.controller;// Nama : Didin nur yahya
import com.smk.bi.ticketing.model.City;
import com.smk.bi.ticketing.service.CityService;
import groovy.transform.AutoClone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// kelas : 16102087
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService cityService;

    @PostMapping("/save")
    public City saveCity(@RequestBody City city){
        return cityService.insertCity(city);

    }
    @PostMapping("/delete")
    public Map<String,Object> deleteCity(@RequestBody City city){
        Map<String,Object> result = new HashMap<>();
        cityService.deleteCity(city);
        result.put("Status","OK");
        result.put("Message","OK");
        return result;
    }

    @PostMapping("/findByIdd")
    public City findById(@RequestBody City city){
        return cityService.findByIdd(city.getCityId());
    }
    @PostMapping("/findByCityName")
    public List<City> findByCityName(@RequestBody City city){
        return cityService.findByCityName(city.getCityName());
    }

}
