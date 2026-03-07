package com.phcvfcorp.movies_manegement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cf_diretor")
public class Diretor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String nome;

    public Diretor(){

    }

    public Diretor(String nome){
        this.nome = nome;
    }

    public Diretor(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }


}
