package com.vishal.springjpa.controller;

import com.vishal.springjpa.entity.Product;
import com.vishal.springjpa.service.ProductService;
import lombok.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Value
public class ProductController {

    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

}
