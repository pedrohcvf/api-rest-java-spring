package com.phcvfcorp.movies_manegement.Service;

import com.phcvfcorp.movies_manegement.Dtos.DiretorDto;
import com.phcvfcorp.movies_manegement.Entities.Diretor;
import com.phcvfcorp.movies_manegement.Repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiretorService {

    @Autowired
    private DiretorRepository diretorRepository;

    // ADICIONAR DIRETOR
    @Transactional(readOnly = false)
    public boolean addDiretor(DiretorDto diretor){

        Diretor novoDiretor = diretorRepository.save(new Diretor(diretor));

        if (novoDiretor != null){
            return true;
        }
        else {
            return false;
        }
    }

    // LISTAR DIRETORES
    @Transactional(readOnly = true)
    public List<DiretorDto> listaDiretores(){

        List<Diretor> diretoresDoBanco = this.diretorRepository.findByOrderByNomeAsc();

        List<DiretorDto> diretoresDto = null;

        if (diretoresDoBanco != null){
            diretoresDto = new ArrayList<DiretorDto>();

            for (Diretor d : diretoresDoBanco){
                diretoresDto.add(new DiretorDto(d));
            }
        }

        return diretoresDto;
    }
}
