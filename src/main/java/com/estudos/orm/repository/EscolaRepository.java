package com.estudos.orm.repository;

import com.estudos.orm.entity.Escola;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends CrudRepository<Escola, Long> {

}
