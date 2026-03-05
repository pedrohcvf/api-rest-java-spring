package com.phcvfcorp.movies_manegement.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    @ManyToOne
    private Diretor diretor;
    @ManyToMany
    private Set<Ator> elenco;
    private Float nota;

    public Filme(String nome, Diretor diretor, Set<Ator> elenco, Float nota){
        this.nome = nome;
        this.diretor = diretor;
        this.elenco = elenco;
        this.nota = nota;
    }

}
