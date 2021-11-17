package com.estudos.orm.service;

import com.estudos.orm.entity.Escola;
import com.estudos.orm.repository.EscolaRepository;
import org.springframework.stereotype.Service;

@Service
public class EscolaService {

    private final EscolaRepository repository;

    public EscolaService(EscolaRepository repository) {
        this.repository = repository;
    }

    public final void processSchool(Escola escola) {
        repository.save(escola);
    }

    public final Iterable<Escola> getAll() {
        return repository.findAll();
    }
}
