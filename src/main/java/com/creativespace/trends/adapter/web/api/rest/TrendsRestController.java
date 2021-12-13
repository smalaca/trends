package com.creativespace.trends.adapter.web.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class TrendsRestController {
    @GetMapping
    public String hello(@RequestParam(defaultValue = "No Name") String name) {
        return "Hello " + name + "! Are you looking for some suggestions?";
    }
}
