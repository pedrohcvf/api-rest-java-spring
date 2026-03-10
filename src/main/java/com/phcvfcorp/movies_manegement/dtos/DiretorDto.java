package com.phcvfcorp.movies_manegement.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phcvfcorp.movies_manegement.entities.Diretor;
import lombok.Data;

import java.io.Serializable;

@Data
public class DiretorDto implements Serializable {

    private static final long  serialVersionUID = 1L;


    @JsonProperty
    public String nome;

    public DiretorDto(String nome){
        this.nome = nome;
    }

    public DiretorDto(DiretorDto diretor){
        this.nome = diretor.getNome();
    }

    public DiretorDto(Diretor diretor){
        this.nome = diretor.getNome();
    }
}

