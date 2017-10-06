package com.smk.bi.ticketing.service;

import com.smk.bi.ticketing.model.City;

import java.util.List;

public interface CityService {
    City insertCity(City city);
    City UpdateCity(City city);
    void deleteCity(City city);
    City findByIdd(Long idd
    );
    List<City> findByName(String cityName);
}
