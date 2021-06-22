package com.example.day0622.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sweeney
 * @since 2021/06/22 14:34 created.
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String Hello(){
        return "Hello Spring Boot!";
    }

}
