package com.estudos.orm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

import lombok.Data;

@Data
@Entity
@Table
public class Aluno {

    public final static String ID_SEQUENCE = "SQ_ALUNO_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Aluno.ID_SEQUENCE)
    @SequenceGenerator(name = Aluno.ID_SEQUENCE, sequenceName = Aluno.ID_SEQUENCE, allocationSize = 1)
    private Long cpf;

    private Long rg;
    private String nome;
    private String endereco;
    private String telefone1;
    private String telefone2;
    private String email;

    @ManyToMany(mappedBy = "aluno")
    private List<Materia> materia;

}
