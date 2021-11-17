package com.estudos.orm.controller;

import com.estudos.orm.entity.Escola;
import com.estudos.orm.service.EscolaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EscolaController.URL_MAPPING)
public class EscolaController {

    public static final String URL_MAPPING = "/school";

    private final EscolaService service;

    public EscolaController(EscolaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity getAllSchools(){
        final var response = service.getAll();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity createSchool(@RequestBody final Escola escola){
        service.processSchool(escola);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}
