package com.api.rest.service;

import org.springframework.stereotype.Service;

@Service
public class SumaService {

    public String getHola() {
        return new String("Hola Mundo");
    }

    public Integer getSuma(Integer a, Integer b) {        
        return a + b;
    }

}
