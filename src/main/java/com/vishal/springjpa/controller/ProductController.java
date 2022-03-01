package com.vishal.springjpa.controller;

import com.vishal.springjpa.entity.Product;
import com.vishal.springjpa.service.AuthenticationProvider;
import com.vishal.springjpa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final AuthenticationProvider authenticationProvider;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product, String token){
        authenticationProvider.doAuthentication(token);
        return productService.saveProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(String token){
        authenticationProvider.doAuthentication(token);
        return productService.getAllProducts();
    }




}
