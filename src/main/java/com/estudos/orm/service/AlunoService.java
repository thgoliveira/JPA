package com.estudos.orm.service;

import com.estudos.orm.entity.Aluno;
import com.estudos.orm.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public void createStudent(Aluno aluno) {
        repository.save(aluno);
    }

    public Iterable<Aluno> getAll() {
        return repository.findAll();
    }
}
