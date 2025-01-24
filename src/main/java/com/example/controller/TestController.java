package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public ResponseEntity<Map<String, String>> test(){
        return ResponseEntity.ok().body(Map.of("name", "Madiyor"));
    }

    @GetMapping(value = "/health")
    public ResponseEntity<Map<String, String>> health(){
        return ResponseEntity.ok().body(Map.of("status", "UP and RUNNING"));
    }
}
