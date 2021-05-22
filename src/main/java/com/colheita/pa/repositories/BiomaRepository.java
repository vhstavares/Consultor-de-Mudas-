package com.colheita.pa.repositories;

import com.colheita.pa.entities.Bioma;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiomaRepository extends JpaRepository <Bioma,Long>{
    
}
