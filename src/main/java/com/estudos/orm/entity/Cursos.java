package com.estudos.orm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.List;

import lombok.Data;

@Data
@Entity
@Table
public class Cursos {

    public final static String ID_SEQUENCE = "SQ_CURSOS_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Cursos.ID_SEQUENCE)
    @SequenceGenerator(name = Cursos.ID_SEQUENCE, sequenceName = Cursos.ID_SEQUENCE, allocationSize = 1)
    private Long id;

    private String nome;
    private String duracao;

    @OneToMany(mappedBy = "cursos")
    private List<Materia> materia;

    @ManyToOne
    @JoinColumn(name = "escola_id")
    private Escola escola;

}
