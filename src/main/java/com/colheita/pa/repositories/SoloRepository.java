package com.colheita.pa.repositories;

import com.colheita.pa.entities.Solo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoloRepository extends JpaRepository <Solo,Long>{
    
}
