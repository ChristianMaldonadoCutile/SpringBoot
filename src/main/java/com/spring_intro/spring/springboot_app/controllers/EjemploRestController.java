package com.spring_intro.spring.springboot_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EjemploRestController {

    @GetMapping("/detalle_info2")
    public Map<String, Object> info(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo","Servidor en linea");
        respuesta.put("Servidor","ApiRest");
        respuesta.put("Ip","192.168.1.1");
        return respuesta;
    }

}
