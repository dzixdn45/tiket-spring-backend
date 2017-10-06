package com.smk.bi.ticketing.service;// Nama : Didin nur yahya
import com.smk.bi.ticketing.model.Rails;
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
public class RailsServiceImplTest {
    @Autowired
    private RailsService railsService;

    @Test
    public void insertCity() throws Exception {
        Rails rails = new Rails();
        Rails.setRailsName("jahtot ekspress");
        Rails.setCapacityRails(200);
        assert (railsService.insertRails(rails).getRailsId() != 0);
    }
    public void findByRailsName() throws Exception {
        assert (railsService.findByRailsName("jahtot ekspress").get(0).getCapacityRails().equals(200));
    }
}
