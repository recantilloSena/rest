package com.api.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.rest.service.SumaService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class SumaController {

    private SumaService sumaService;
    
    public SumaController(SumaService sumaService) {
        this.sumaService = sumaService;
    }



    @GetMapping("/hola")
    public String getHola() {
        return sumaService.getHola();
    }


    @GetMapping("/suma/{a}/{b}")
    @Operation(summary = "Sumar dos números",
               description = "Retorna LA suna de los números dados")
    public Integer getSuma(@PathVariable Integer a, @PathVariable Integer b) {
        return sumaService.getSuma(a,b);
    }
    
    

    
}
