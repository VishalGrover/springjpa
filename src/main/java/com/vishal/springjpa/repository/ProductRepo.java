package com.vishal.springjpa.repository;

import com.vishal.springjpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    public Product getByName(String name);
    public Product getById(Integer id);
}
