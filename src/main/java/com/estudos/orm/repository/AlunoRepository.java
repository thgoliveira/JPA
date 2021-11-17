package com.estudos.orm.repository;

import com.estudos.orm.entity.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {

}
