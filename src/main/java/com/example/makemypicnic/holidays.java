package com.example.makemypicnic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class holidays {
    @GetMapping("/holidays")
    public String getData() {return "please book your ticket with 30% discount";}
}
