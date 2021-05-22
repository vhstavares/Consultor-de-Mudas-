package com.colheita.pa.repositories;

import com.colheita.pa.entities.Regiao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository <Regiao,Long>{
    
}
