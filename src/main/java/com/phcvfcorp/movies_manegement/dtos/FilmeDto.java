package com.phcvfcorp.movies_manegement.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phcvfcorp.movies_manegement.entities.Filme;
import lombok.Data;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class FilmeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String nome;
    @JsonProperty
    private DiretorDto diretor;
    @JsonProperty
    private Set<AtorDto> elenco;
    @JsonProperty
    private float nota;

    public FilmeDto(String nome, DiretorDto diretor, Set<AtorDto> elenco, float nota){
        super();
        this.nome = nome;
        this.diretor = new DiretorDto(diretor);
        this.elenco = new HashSet<AtorDto>(elenco);
    }

    public FilmeDto(FilmeDto filme){
        this(filme.getNome(), filme.getDiretor(), filme.getElenco(), filme.getNota());
    }

    public FilmeDto(Filme filme){
        this.nome = getNome();
        this.diretor = new DiretorDto(filme.getDiretor());
        this.nota = getNota();
    }

}
