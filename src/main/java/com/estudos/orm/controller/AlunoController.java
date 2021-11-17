package com.estudos.orm.controller;

import com.estudos.orm.entity.Aluno;
import com.estudos.orm.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AlunoController.URL_MAPPING)
public class AlunoController {

    public static final String URL_MAPPING = "/student";

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity getAllStudents(){
        var response = service.getAll();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity createStudent(@RequestBody Aluno aluno){
        service.createStudent(aluno);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}
