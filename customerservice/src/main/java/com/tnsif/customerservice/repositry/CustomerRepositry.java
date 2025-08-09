package com.tnsif.customerservice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.customerservice.entity.Customer;

public interface CustomerRepositry extends JpaRepository<Customer, Integer> {

}
