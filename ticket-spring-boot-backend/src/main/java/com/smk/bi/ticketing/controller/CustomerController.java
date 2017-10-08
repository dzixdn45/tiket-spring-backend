package com.smk.bi.ticketing.controller;// Nama : Didin nur yahya

import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.service.CustomerService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.insertCustomer(customer);

    }

    @PostMapping("/delete")
    public Map<String,Object> deleteCustomer(@RequestBody Customer customer){
        Map<String,Object> result = new HashMap<>();
        customerService.deleteCustomer(customer);
        result.put("Status","OK");
        result.put("Message","OK");
        return result;
    }

    @PostMapping("/findById")
    public Customer findById(@RequestBody Customer customer){
        return customerService.findById(customer.getCustomerId());
    }
    @PostMapping("/findByName")
    public List<Customer> findByName(@RequestBody Customer customer){
        return customerService.findByName(customer.getName());
    }
}
