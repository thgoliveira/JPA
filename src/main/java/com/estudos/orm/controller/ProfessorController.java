package com.estudos.orm.controller;

import com.estudos.orm.entity.Professor;
import com.estudos.orm.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProfessorController.URL_MAPPING)
public class ProfessorController {

    public static final String URL_MAPPING = "/professor";

    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity getAllProfessors(){
        final var response = service.getAll();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity createProfessor(@RequestBody Professor professor){
        service.createProfessor(professor);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
