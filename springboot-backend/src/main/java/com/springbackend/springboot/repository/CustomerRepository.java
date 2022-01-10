package com.springbackend.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbackend.springboot.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	

}
