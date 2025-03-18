package com.spring_intro.spring.springboot_app.controllers;

import com.spring_intro.spring.springboot_app.models.dto.ClaseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EjemploDTOController {

    @GetMapping(path = "/info2")
    public ClaseDTO info() {

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Christian");
        return usuario1;
    }


}
