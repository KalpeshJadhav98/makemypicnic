package com.example.makemypicnic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData() {return "please book hotel with 30% discount";}
}
