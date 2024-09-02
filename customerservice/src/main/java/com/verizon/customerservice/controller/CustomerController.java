package com.verizon.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.customerservice.model.Customer;
import com.verizon.customerservice.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable int id) {
        return customerService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Customer customer) {
        customerService.save(customer);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody Customer customer) {
        customerService.update(id, customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        customerService.delete(id);
    }

}
