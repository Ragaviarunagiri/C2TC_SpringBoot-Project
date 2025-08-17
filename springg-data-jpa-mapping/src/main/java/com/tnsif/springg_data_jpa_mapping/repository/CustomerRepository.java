package com.tnsif.springg_data_jpa_mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tnsif.springg_data_jpa_mapping.dto.OrderResponse;
import com.tnsif.springg_data_jpa_mapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT c FROM Customer c")
	List<Customer> findAllCustomers();

	List<OrderResponse> getJoinInformation();

	@SuppressWarnings("unchecked")
	Customer save(Customer customer);

	<S> Customer save(S customer);

}