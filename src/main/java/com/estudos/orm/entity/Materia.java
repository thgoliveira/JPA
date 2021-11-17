package com.estudos.orm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

import lombok.Data;

@Data
@Entity
@Table
public class Materia {

    public final static String ID_SEQUENCE = "SQ_MATERIA_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Materia.ID_SEQUENCE)
    @SequenceGenerator(name = Materia.ID_SEQUENCE, sequenceName = Materia.ID_SEQUENCE, allocationSize = 1)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(name = "materias_professores")
    private List<Professor> professor;

    @ManyToMany
    @JoinTable(name = "materias_alunos")
    private List<Aluno> aluno;

    @ManyToOne
    @JoinColumn(name = "cursos_id")
    private Curso curso;
}
