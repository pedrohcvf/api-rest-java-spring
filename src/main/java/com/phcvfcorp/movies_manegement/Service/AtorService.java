package com.phcvfcorp.movies_manegement.Service;

import com.phcvfcorp.movies_manegement.dtos.AtorDto;
import com.phcvfcorp.movies_manegement.entities.Ator;

import com.phcvfcorp.movies_manegement.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtorService {

    @Autowired
    private AtorRepository atorRepository;

    // ADICIONAR ATOR
    @Transactional(readOnly = false)
    public boolean addAtor(AtorDto ator) {
        Ator novoAtor = new Ator(ator);

        Ator atorSalvo = this.atorRepository.save(novoAtor);


        if (atorSalvo != null){
            return true;
        }
        else {
            return false;
        }
    }

    // LISTAR ATORES
    @Transactional(readOnly = true)
    public List<AtorDto> ListaAtores(){

        List<Ator> atoresDoBanco = atorRepository.findByOrderByNomeAsc();

        List<AtorDto> atores = null;

        if(atoresDoBanco != null){

            atores = new ArrayList<AtorDto>();

            for (Ator a: atoresDoBanco){
                atores.add(new AtorDto(a));
            }
        }
        return atores;
    }





}
