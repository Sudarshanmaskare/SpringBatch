package com.SpringBatch.SpringBatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.SpringBatch.SpringBatch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
