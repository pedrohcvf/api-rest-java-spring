package com.phcvfcorp.movies_manegement.Service;

import com.phcvfcorp.movies_manegement.Dtos.AtorDto;
import com.phcvfcorp.movies_manegement.Dtos.DiretorDto;
import com.phcvfcorp.movies_manegement.Dtos.FilmeDto;
import com.phcvfcorp.movies_manegement.Entities.Ator;
import com.phcvfcorp.movies_manegement.Entities.Diretor;
import com.phcvfcorp.movies_manegement.Entities.Filme;
import com.phcvfcorp.movies_manegement.Repository.AtorRepository;
import com.phcvfcorp.movies_manegement.Repository.DiretorRepository;
import com.phcvfcorp.movies_manegement.Repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;
    @Autowired
    private AtorRepository atorRepository;
    @Autowired
    private DiretorRepository diretorRepository;

    // ADICIONAR FILME
    @Transactional(readOnly = false)
    public boolean addFilme(FilmeDto filme) {

        Diretor diretorExistente = diretorRepository.getReferenceByNome(filme.getDiretor().getNome());

        HashSet<Ator> elenco = new HashSet<Ator>();

        // REGRA DE ELENCO
        for (AtorDto a: filme.getElenco()){
            Ator atorExistente = atorRepository.getReferenceByNome(a.getNome());

            if (atorExistente != null){
                elenco.add(atorExistente);
            }
            else{
                elenco.add(new Ator(a));
            }
        }

        // REGRA SE NAO EXISTIR DIRETOR
        Filme f;

        if(diretorExistente != null)
            f = new Filme(filme.getNome(), diretorExistente, elenco, filme.getNota());
        else
            f = new Filme(filme.getNome(), new Diretor(filme.getDiretor()), elenco, filme.getNota());

        Filme filmeRetorno = filmeRepository.save(f);

        if(filmeRetorno != null)
            return true;
        else
            return false;
    }

    // LISTAR FILMES
    @Transactional(readOnly = true)
    public List<FilmeDto> listarFilmePorNome() {

        List<Filme> filmesDoBanco = this.filmeRepository.findByOrderByNomeAsc();

        List<FilmeDto> filmesDto = converteListaFilmeParaFilmeDto(filmesDoBanco);
        return filmesDto;
    }

    // LISTAR FILMES POR DIRETOR
    @Transactional(readOnly = true)
    public List<FilmeDto> listarFilmesPorDiretor(DiretorDto diretor) {

        Diretor diretorDoBanco = diretorRepository.getReferenceByNome(diretor.getNome());

        if (diretorDoBanco == null)
            return null;

        List<Filme> filmesDoBanco = filmeRepository.findByDiretorOrderByNomeAsc(diretorDoBanco);

        List<FilmeDto> filmesDto = converteListaFilmeParaFilmeDto(filmesDoBanco);
        return filmesDto;
    }

    // LISTAR FILMES POR ATOR
    @Transactional(readOnly = true)
    public List<FilmeDto> listarFilmesPorAtor(AtorDto ator){

        Ator a = this.atorRepository.getReferenceByNome(ator.getNome());

        if (a == null)
            return null;

        List<Filme> filmesDoBanco = filmeRepository.findByAtorOrderByNome(a.getId());

        List<FilmeDto> filmesDto = converteListaFilmeParaFilmeDto(filmesDoBanco);

        return filmesDto;
    }

    // LISTAR FILMES POR NOTA
    @Transactional(readOnly = true)
    public List<FilmeDto> listarFilmesPorNota(Float nota){

        List<Filme> filmesDoBanco = filmeRepository.findByNotaGreaterThanEqualOrderByNome(nota);

        List<FilmeDto> filmeDto = converteListaFilmeParaFilmeDto(filmesDoBanco);

        return filmeDto;
    }

    // CONVERSAO PARA FILME DTO
    private List<FilmeDto> converteListaFilmeParaFilmeDto(List<Filme> filmes) {

        List<FilmeDto> filmesDto = null;

        if (filmes != null) {
            filmesDto = new ArrayList<FilmeDto>();

            for (Filme f : filmes)
                filmesDto.add(new FilmeDto(f));

        }
        return filmesDto;
    }
}