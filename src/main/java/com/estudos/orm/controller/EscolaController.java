package com.estudos.orm.controller;

import com.estudos.orm.entity.Escola;
import com.estudos.orm.service.EscolaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/escola")
public class EscolaController {

    private final EscolaService service;

    public EscolaController(EscolaService service) {
        this.service = service;
    }

    public ResponseEntity createEscola(@RequestBody final Escola escola){
        service.processSchool(escola);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}