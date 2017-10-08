package com.smk.bi.ticketing.service;// Nama : Didin nur yahya
import com.smk.bi.ticketing.model.City;
import com.smk.bi.ticketing.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
// kelas : 16102087
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public City insertCity(City city) {
        return cityRepository.save(city);
    }
    @Override
    public City UpdateCity(City city) {
        return cityRepository.save(city);
    }
    @Override
    public void deleteCity(City city) {
        cityRepository.delete(city.getCityId());
    }

    @Override
    public City findByIdd(Long idd) {
        return cityRepository.findOne(idd); 
    }
    @Override
    public List<City> findByCityName(String cityName) { return cityRepository.findByCityName(cityName);
    }

}
