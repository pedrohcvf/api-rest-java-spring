package com.phcvfcorp.movies_manegement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phcvfcorp.movies_manegement.entities.Ator;
import com.phcvfcorp.movies_manegement.entities.Diretor;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Long> {
    public List<Diretor> findByOrderByNomeAsc();
    public Diretor getReferenceByNome(String nome);


    String nome(String nome);
}
