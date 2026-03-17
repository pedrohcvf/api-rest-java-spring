package com.phcvfcorp.movies_manegement.Controller;

import com.phcvfcorp.movies_manegement.Dtos.AtorDto;
import com.phcvfcorp.movies_manegement.Dtos.DiretorDto;
import com.phcvfcorp.movies_manegement.Dtos.FilmeDto;
import com.phcvfcorp.movies_manegement.Service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    // ADICIONAR FILME
    @PostMapping("/filmes")
    public boolean addFilmes (@RequestBody FilmeDto filme){
        return this.filmeService.addFilme(filme);
    }

    // LISTAR TODOS OS FILMES
    @GetMapping("/filmes")
    public List<FilmeDto> listarFilmes(){
        return this.filmeService.listarFilmePorNome();
    }

    // LISTAR FILMES POR DIRETOR
    @GetMapping("/filmes/diretor/{nomediretor}")
    public List<FilmeDto> listarFilmesPorDiretor(@PathVariable("nomediretor") String nomeDiretor){
        DiretorDto diretorDto = new DiretorDto(nomeDiretor);
        return this.filmeService.listarFilmesPorDiretor(diretorDto);

    }

    // LISTAR FILMES POR ATOR
    @GetMapping("/filmes/ator/{nomeator}")
    public List<FilmeDto> listarFlmesPorAtor(@PathVariable("nomeator") String nomeAtor){
        AtorDto ator = new AtorDto(nomeAtor);
        return this.filmeService.listarFilmesPorAtor(ator);
    }

    // LISTAR FILMES POR NOTA
    @GetMapping("/filme/nota/{nota}")
    public List<FilmeDto> listarFlmesPorNota(@PathVariable("nota") Float nota){
        return this.filmeService.listarFilmesPorNota(nota);
    }
}
