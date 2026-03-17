package com.phcvfcorp.movies_manegement.Controller;


import com.phcvfcorp.movies_manegement.Dtos.AtorDto;
import com.phcvfcorp.movies_manegement.Service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtorController {

    @Autowired
    private AtorService atorService;

    // ADICIONAR ATORES
    @PostMapping("/atores")
    public boolean addAtor (@RequestBody AtorDto ator){
        return this.atorService.addAtor(ator);
    }

    // LISTAR TODOS OS ATORES
    @GetMapping("/atores")
    public List<AtorDto> listaAtores(){
        return this.atorService.ListaAtores();
    }
}
