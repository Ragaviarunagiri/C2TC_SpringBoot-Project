package com.tnsif.springg_data_jpa_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.springg_data_jpa_mapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}