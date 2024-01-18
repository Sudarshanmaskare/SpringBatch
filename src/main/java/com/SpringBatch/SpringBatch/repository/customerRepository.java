package com.SpringBatch.SpringBatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBatch.SpringBatch.entity.Customer;

public interface customerRepository extends JpaRepository<Customer, Integer> {

}
