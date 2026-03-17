package com.phcvfcorp.movies_manegement.Controller;


import com.phcvfcorp.movies_manegement.Dtos.DiretorDto;
import com.phcvfcorp.movies_manegement.Service.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiretorController {

    @Autowired
    private DiretorService diretorService;

    // ADICIONAR DIRETOR
    @PostMapping("/diretores")
    public boolean addDiretor(@RequestBody DiretorDto diretor){
        return this.diretorService.addDiretor(diretor);
    }

    // LISTAR TODOS OS DIRETORES
    @GetMapping("/diretores")
    public List<DiretorDto> listaDiretores(){
        return this.diretorService.listaDiretores();
    }

}
