package com.phcvfcorp.movies_manegement.dtos;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.phcvfcorp.movies_manegement.entities.Ator;
import lombok.Data;



import java.io.Serializable;

@Data //Cria tudo
public class AtorDto implements Serializable {

    private static final long serialVersionUID = 1L;


    @JsonProperty
    private String nome;

    //===================================
    //        CONSTRUTORES
    //===================================
    public AtorDto(){

    }

    @JsonCreator
    public AtorDto(String nome){
        this.nome = nome;
    }

    public AtorDto(AtorDto ator){
        this.nome = ator.getNome();
    }

    public AtorDto(Ator ator){
        this.nome = ator.getNome();
    }
    //===================================
    //        CONSTRUTORES
    //===================================



}
