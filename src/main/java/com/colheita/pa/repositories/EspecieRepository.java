package com.colheita.pa.repositories;


import com.colheita.pa.entities.Especie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository <Especie,Long>{

}
    

