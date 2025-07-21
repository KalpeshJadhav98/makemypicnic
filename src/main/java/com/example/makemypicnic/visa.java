package com.example.makemypicnic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class visa{
    @GetMapping("/visa")
    public String getData() {return "please create a visa with 30% discount";}
}
