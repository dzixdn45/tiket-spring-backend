package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
List<Customer> findByName(String customerName);
List<Customer> findByCustomerEmail(String customerEmail);
List<Customer> findByNameAndCustomerEmail(String customerName, String customerEmail);
}
