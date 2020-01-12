package com.example.hc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hc")
public class HController {

    @GetMapping("/hh")
    public String hh() {
        return "Jkljklj";
    }
}
