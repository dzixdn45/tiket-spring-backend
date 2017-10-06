package com.smk.bi.ticketing.service;// Nama : Didin nur yahya

import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// kelas : 16102087
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public Customer UpdateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
     customerRepository.delete(customer.getCustomerId());
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }
}
