package com.spring_intro.spring.springboot_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalle_info")
    public String info(Model model){
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Prueba");
        model.addAttribute("Ip", "192.168.1.1");
        return "detalle_info";
    }
}
