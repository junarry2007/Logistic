package com.logistic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ArrayController {

    @GetMapping("/healt-check")
    public String executionCheck(){
        return "Servicios en ejecución - Juan Pablo Valdes";
    }

}