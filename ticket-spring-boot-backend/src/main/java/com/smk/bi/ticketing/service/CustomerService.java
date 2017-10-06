package com.smk.bi.ticketing.service;

import com.smk.bi.ticketing.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer insertCustomer(Customer customer);
    Customer UpdateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer findById(Long id);
    List<Customer> findByName(String name);

}
