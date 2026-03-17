package com.phcvfcorp.movies_manegement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.phcvfcorp.movies_manegement.Entities.Ator;


@Repository
public interface AtorRepository extends JpaRepository<Ator, Long>  {
    public List<Ator> findByOrderByNomeAsc();

    public Ator getReferenceByNome(String nome);

    Ator findByNome(String nome);
}
