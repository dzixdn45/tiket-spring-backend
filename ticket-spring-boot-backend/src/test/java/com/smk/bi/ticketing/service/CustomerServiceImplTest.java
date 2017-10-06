package com.smk.bi.ticketing.service;// Nama : Didin nur yahya

import com.smk.bi.ticketing.model.Customer;
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
public class CustomerServiceImplTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void insertCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setName("smk bi");
        customer.setCustomerEmail("smk@gmail.com");
        customer.setCustomerAddres("Bintarro");
        customer.setCostumerPhone("827277");
        customer.setIdentifyNumber(12456);
        assert (customerService.insertCustomer(customer).getCustomerId() != 0);
    }
    @Test
    public void findByName() throws Exception {
        assert (customerService.findByName("smk bi").get(0).getCustomerEmail().
                equalsIgnoreCase("smk@gmail.com"));
    }

}
