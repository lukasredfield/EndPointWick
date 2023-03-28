package com.api.Api.controller;

import com.api.Api.bean.Persona;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @RequestMapping(value = "persona", method = RequestMethod.GET)
    public Persona obtenerPersona(HttpServletRequest request) {

        Persona persona1 = new Persona();
        persona1.setNombre("John");
        persona1.setApellido("Wick");
        persona1.setDocumento("2956547709");

        return persona1;


    }
}

//