package com.vishal.springjpa.controller;

import com.vishal.springjpa.entity.Product;
import com.vishal.springjpa.model.Time;
import com.vishal.springjpa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
//@RefreshScope
public class TimeController {

    private final Time time;

    @GetMapping("/getTime")
    public ResponseEntity<List<Time.TimeValue>> getTime(){
        System.out.println(time.getTimeValueList());
        return ResponseEntity.ok(time.getTimeValueList());
    }

}
