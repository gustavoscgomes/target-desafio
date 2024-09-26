package com.targetsistemas.fibonacci.controller;

import com.targetsistemas.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    @Autowired
    private FibonacciService service;

    @GetMapping("/fibonacci")
    public String checkFibonacci(@RequestParam int number) {
        boolean isFibonacci = service.isFibonacci(number);
        if (isFibonacci) {
            return "O numero " + number + " pertence a sequencia de Fibonacci.";
        } else {
            return "O numero " + number + " nao pertence a sequencia de Fibonacci.";
        }
    }
}
