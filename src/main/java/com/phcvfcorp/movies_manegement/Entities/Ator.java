package com.phcvfcorp.movies_manegement.Entities;

import com.phcvfcorp.movies_manegement.Dtos.AtorDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
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


    // CONSTRUTOR 1
    public Ator(String nome){
        this.nome = nome;
    }

    // CONSTRUTOR 2
    public Ator(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    // CONSTRUTOR 3
    public Ator(AtorDto ator){
        this.nome = ator.getNome();
    }

}
