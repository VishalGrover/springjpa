package com.vishal.springjpa.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("test | prod")
@Service
public class TestAuthProvider implements AuthenticationProvider {

    public void doAuthentication(String token){
        System.out.println("Doing authentication using token");
    }
}
