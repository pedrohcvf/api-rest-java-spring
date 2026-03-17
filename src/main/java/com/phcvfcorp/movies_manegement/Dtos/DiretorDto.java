package com.phcvfcorp.movies_manegement.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phcvfcorp.movies_manegement.Entities.Diretor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class DiretorDto implements Serializable {

    private static final long  serialVersionUID = 1L;


    @JsonProperty
    public String nome;

    // CONSTRUTOR 1
    public DiretorDto(String nome){
        this.nome = nome;
    }

    // CONSTRUTOR 2
    public DiretorDto(DiretorDto diretor){
        this.nome = diretor.getNome();
    }

    // CONSTRUTOR 3
    public DiretorDto(Diretor diretor){
        this.nome = diretor.getNome();
    }
}

