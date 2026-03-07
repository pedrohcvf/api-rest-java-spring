package com.phcvfcorp.movies_manegement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.phcvfcorp.movies_manegement.entities.Ator;


@Repository
public interface AtorRepository extends JpaRepository<Ator, Long>  {
    public List<Ator> findByOrderByNomeAsc();
}
