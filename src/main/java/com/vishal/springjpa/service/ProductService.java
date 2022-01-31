package com.vishal.springjpa.service;

import com.vishal.springjpa.entity.Product;
import com.vishal.springjpa.repository.ProductRepo;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Value
public class ProductService {
    private ProductRepo productRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return productRepo.saveAll(products);
    }

    public Product getProductById(int id){
        return productRepo.getById(id);
    }

    public  Product getProductByName(String name){
        return productRepo.getByName(name);
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public String  deleteById(int id){
        productRepo.deleteById(id);
        return "Success";
    }
}
