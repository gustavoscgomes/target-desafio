package com.targetsistemas.fibonacci.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public boolean isFibonacci(int number) {
        if (number < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}
