package com.verizon.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.customerservice.model.Customer;
import com.verizon.customerservice.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void update(int id, Customer customer) {
        customerRepository.save(customer);
    }

    public void delete(int id) {
        customerRepository.deleteById(id);
    }
}
