package com.phcvfcorp.movies_manegement.Dtos;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.phcvfcorp.movies_manegement.Entities.Ator;
import lombok.Data;



import java.io.Serializable;

@Data //Cria tudo
public class AtorDto implements Serializable {

    private static final long serialVersionUID = 1L;


    @JsonProperty
    private String nome;

    // CONSTRUTOR 1
    public AtorDto(){
    }

    // CONSTRUTOR 2
    @JsonCreator
    public AtorDto(String nome){
        this.nome = nome;
    }

    // CONSTRUTOR 3
    public AtorDto(AtorDto ator){
        this.nome = ator.getNome();
    }

    // CONSTRUTOR 4
    public AtorDto(Ator ator){
        this.nome = ator.getNome();
    }




}
