package com.panchodev.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Dummy welcome";
    }
}
