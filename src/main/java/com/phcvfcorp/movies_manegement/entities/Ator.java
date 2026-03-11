package com.phcvfcorp.movies_manegement.entities;

import com.phcvfcorp.movies_manegement.dtos.AtorDto;
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
@Table(name = "cf_ator")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String nome;

    //Construtor 1
    public Ator(){
        
    }

    //Construtor 2
    public Ator(String nome){
        this.nome = nome;
    }

    //Construtor 3
    public Ator(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    //Construtor 4
    public Ator(AtorDto ator){
        this.nome = ator.getNome();
    }

}
