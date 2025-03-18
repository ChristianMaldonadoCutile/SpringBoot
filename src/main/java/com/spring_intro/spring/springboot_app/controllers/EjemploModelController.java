package com.spring_intro.spring.springboot_app.controllers;

import com.spring_intro.spring.springboot_app.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class EjemploModelController {

    @GetMapping(path = "/detalle_info4")

    public String info(Model model) {

        Empleados empleado1 = new Empleados("Christian", "Maldonado", "B/Bibosi",
                                             "Soporte", 27, 65030975, 001);
        model.addAttribute("Titulo","Informacion Personal");
        model.addAttribute("Empleado", empleado1);

        return "detalle_info";
    }

}
