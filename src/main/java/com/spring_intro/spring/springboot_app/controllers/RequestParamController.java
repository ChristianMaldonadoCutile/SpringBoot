package com.spring_intro.spring.springboot_app.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parametros")
public class RequestParamController {

    @GetMapping("/parametro")
    public ParametroDTO detalle(){

    }

}
