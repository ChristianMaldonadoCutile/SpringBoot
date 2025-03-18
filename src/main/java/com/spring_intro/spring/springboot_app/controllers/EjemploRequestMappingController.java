package com.spring_intro.spring.springboot_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EjemploRequestMappingController {

    @RequestMapping(path = "/detalle_info3", method = RequestMethod.GET)
    public Map<String, Object> info(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo","Servidor en linea");
        respuesta.put("Servidor","ApiRest");
        respuesta.put("Ip","192.168.1.1");
        return respuesta;
    }

}
