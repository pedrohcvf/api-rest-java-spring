package com.phcvfcorp.movies_manegement.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phcvfcorp.movies_manegement.Entities.Ator;
import com.phcvfcorp.movies_manegement.Entities.Filme;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
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

    // CONSTRUTOR 1
    public FilmeDto(String nome, DiretorDto diretor, Set<AtorDto> elenco, float nota){
        this.nome = nome;
        this.diretor = new DiretorDto(diretor);
        this.elenco = new HashSet<AtorDto>(elenco);
    }

    // CONSTRUTOR 2
    public FilmeDto(FilmeDto filme){
        this(filme.getNome(), filme.getDiretor(), filme.getElenco(), filme.getNota());
    }

    // CONSTRUTOR 3
    public FilmeDto(Filme filme){
        this.nome = filme.getNome();
        this.diretor = new DiretorDto(filme.getDiretor());
        this.nota = filme.getNota();
        this.elenco = new HashSet<AtorDto>();

        for (Ator a: filme.getElenco()){
            this.elenco.add(new AtorDto(a));
        }
    }

}
