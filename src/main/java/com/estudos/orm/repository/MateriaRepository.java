package com.estudos.orm.repository;

import com.estudos.orm.entity.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Long> {

}
