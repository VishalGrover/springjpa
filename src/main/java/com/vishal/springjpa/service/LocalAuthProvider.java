package com.vishal.springjpa.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("local | qa")
@Service
public class LocalAuthProvider implements AuthenticationProvider {

    public void doAuthentication(String token){
        System.out.println("No authentication required");
    }
}
