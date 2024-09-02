package com.verizon.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verizon.customerservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    
}
