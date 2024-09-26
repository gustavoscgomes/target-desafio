package com.targetsistemas.string.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public int countLetterA(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
