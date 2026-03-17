package com.phcvfcorp.movies_manegement.Entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cf_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Diretor diretor;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Ator> elenco;
    private Float nota;

    public Filme(String nome, Diretor diretor, Set<Ator> elenco, Float nota){
        this.nome = nome;
        this.diretor = diretor;
        this.elenco = elenco;
        this.nota = nota;
    }

}
