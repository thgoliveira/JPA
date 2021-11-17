package com.estudos.orm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

import lombok.Data;

@Data
@Entity
@Table
public class Escola {

    public final static String ID_SEQUENCE = "SQ_ESCOLA_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Escola.ID_SEQUENCE)
    @SequenceGenerator(name = Escola.ID_SEQUENCE, sequenceName = Escola.ID_SEQUENCE, allocationSize = 1)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone1;
    private String telefone2;
    private String email;

    @OneToMany(mappedBy = "escola")
    private List<Curso> cursos;

}
