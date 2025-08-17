package com.tnsif.springg_data_jpa_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.springg_data_jpa_mapping.dto.OrderRequest;
import com.tnsif.springg_data_jpa_mapping.dto.OrderResponse;
import com.tnsif.springg_data_jpa_mapping.entity.Customer;
import com.tnsif.springg_data_jpa_mapping.repository.CustomerRepository;

@RestController
public class OrderController<S> {

    @Autowired
    private CustomerRepository customerRepository;

    // ✅ Place Order
    @SuppressWarnings("unchecked")
	@PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return customerRepository.save((S) request.getCustomer());  // no casting needed
    }

    // ✅ Find all Orders
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();   // directly use JpaRepository method
    }

    // ✅ Join Information
    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }
}