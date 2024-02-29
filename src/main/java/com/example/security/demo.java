package com.example.security;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demoController")
public class demo {
    @GetMapping
    public ResponseEntity<String> helo(){
        return ResponseEntity.ok("helo from secured endpoint");
    }

}
