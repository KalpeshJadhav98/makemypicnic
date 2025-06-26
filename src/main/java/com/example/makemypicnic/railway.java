package com.example.makemypicnic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class railway {
    @GetMapping("/ticket")
    public String getData() {return "please book railway ticket with 30% discount";}
}
