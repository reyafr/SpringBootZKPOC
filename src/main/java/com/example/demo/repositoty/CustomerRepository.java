package com.example.demo.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer; 

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{ 
	
}
