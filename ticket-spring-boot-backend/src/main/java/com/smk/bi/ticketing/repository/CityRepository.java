package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
    List<City> findByCityId(String cityId);
    List<City> findByCityName(String cityName);
    List<City> findByCityIdAndCityName(String cityId, String cityName);
}
