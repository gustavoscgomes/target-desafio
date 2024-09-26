package com.targetsistemas.string.controller;

import com.targetsistemas.string.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @Autowired
    private StringService service;

    @GetMapping("/check-string")
    public String checkStringForA(@RequestParam String input) {
        int count = service.countLetterA(input);
        if (count > 0) {
            return "A letra 'a' ou 'A' ocorre " + count + " vez(es) na string informada.";
        } else {
            return "A letra 'a' ou 'A' nao foi encontrada na string.";
        }
    }
}
