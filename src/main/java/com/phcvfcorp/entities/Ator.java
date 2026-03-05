package com.phcvfcorp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cf_ator")
public class Ator {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    public Ator(){

    }
    
    public Ator(String nome){
        this.nome = nome;
    }

    public Ator(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    // get & set Nome
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    // get & set ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}
