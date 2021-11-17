package com.estudos.orm.service;

import com.estudos.orm.entity.Professor;
import com.estudos.orm.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public void createProfessor(Professor professor) {
        repository.save(professor);
    }

    public Iterable<Professor> getAll() {
       return repository.findAll();
    }
}
