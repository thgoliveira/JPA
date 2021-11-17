package com.estudos.orm.repository;

import com.estudos.orm.entity.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {

}
