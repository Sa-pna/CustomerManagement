package com.springbackend.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbackend.springboot.model.Customer;
import com.springbackend.springboot.repository.CustomerRepository;


@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	

	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
}







