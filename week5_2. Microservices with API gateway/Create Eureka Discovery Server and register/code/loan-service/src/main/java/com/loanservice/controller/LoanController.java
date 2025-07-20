package com.loanservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Loan Service";
    }
}
