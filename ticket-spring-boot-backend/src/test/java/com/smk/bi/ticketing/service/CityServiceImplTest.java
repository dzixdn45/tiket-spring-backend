package com.smk.bi.ticketing.service;// Nama : Didin nur yahya
import com.smk.bi.ticketing.model.City;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
// kelas : 16102087

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.JVM)
public class CityServiceImplTest {
    @Autowired
    private CityService cityService;

    @Test
    public void insertCity() throws Exception {
        City city = new City();
        city.setCityName("toumpel");
        city.setValid("valid");
        assert (cityService.insertCity(city).getCityId() != 0);
    }
    public void findByCityName() throws Exception {
        assert (cityService.findByName("toumpel").get(0).getValid().
                equalsIgnoreCase("valid"));
    }
}
