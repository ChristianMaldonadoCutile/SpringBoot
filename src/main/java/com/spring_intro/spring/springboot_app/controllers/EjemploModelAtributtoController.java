package com.spring_intro.spring.springboot_app.controllers;

import com.spring_intro.spring.springboot_app.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api")
public class EjemploModelAtributtoController {

    @GetMapping(path = "/modelAtributte1")

    public String info(Model model) {

        Empleados empleado1 = new Empleados("Christian", "Maldonado", "B/Bibosi",
                                             "Soporte", 27, 65030975, 001);
        model.addAttribute("Titulo","Informacion Personal");
        model.addAttribute("Empleado", empleado1);

        return "modelAtributte";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> listaEmpleados(){
        return Arrays.asList(
                new Empleados("Vivian","Flores","La guardia",
                               "Ingeniera software", 25, 69584933, 002),
                new Empleados("María", "Perez", "Calle segunda no.2",
                               "Secretaria", 20, 123654987, 02),
                new Empleados("María", "Perez", "Calle segunda no.2",
                               "Secretaria", 20, 123654987, 02),
                new Empleados("Juan", "Rodriguez", "Calle primera no.1",
                               "Gerente", 35, 123456789, 01),
                new Empleados("Luis", "Martínez", "Calle tercera no.3",
                               "Contador", 28, 987654321, 03),
                new Empleados("Ana", "González", "Avenida central no.4",
                               "Diseñadora", 30, 456789123, 04),
                new Empleados("Pedro", "Sánchez", "Boulevard no.5",
                               "Analista", 25, 789123456, 05)
        );
    }

}
