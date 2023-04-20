package com.spring.security.youtube.spilca.spring_security_youtube_spilca_lesson5.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test1")
    public String demo() {
        return "demo";
    }

    @GetMapping("/test2")
    public String hello() {
        return "hello";
    }
}
