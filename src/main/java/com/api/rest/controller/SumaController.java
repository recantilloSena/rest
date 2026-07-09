package com.api.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.rest.service.SumaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




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
    public Integer getSuma(@PathVariable Integer a, @PathVariable Integer b) {
        return sumaService.getSuma(a,b);
    }
    
    

    
}
