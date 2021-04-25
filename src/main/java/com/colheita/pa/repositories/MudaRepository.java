package com.colheita.pa.repositories;

import com.colheita.pa.entities.Muda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MudaRepository extends JpaRepository <Muda,Long>{
    
}
