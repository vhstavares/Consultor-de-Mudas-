package com.colheita.pa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import com.colheita.pa.dto.mudaDTO.MudaDTO;
import com.colheita.pa.dto.soloDTO.InsertSoloDTO;
import com.colheita.pa.dto.soloDTO.SoloDTO;
import com.colheita.pa.dto.soloDTO.UpdateSolo;
import com.colheita.pa.entities.Muda;
import com.colheita.pa.entities.Solo;
import com.colheita.pa.repositories.SoloRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class SoloService {
    
    @Autowired
    private SoloRepository repo;

    // devolve todas as solos
    public List<SoloDTO> getSolos(){

        List<Solo> soloList = repo.findAll();

        return toDTOList(soloList);
       
    }

    // recupera solo pelo ID
    public SoloDTO getSoloByID(long id){
        
        Optional <Solo> op = repo.findById(id);
        Solo solo = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Solo not found"));
        
        return new SoloDTO(solo);

    }  
    
    public SoloDTO insert(InsertSoloDTO insertDTO){
        
        Solo entity = new Solo(insertDTO);
        entity = repo.save(entity);

        return new SoloDTO(entity);

    }

    public void delete(Long id){
       
        try{
           repo.deleteById(id);
       }
       catch (EmptyResultDataAccessException e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Solo not found");
       }

    }

    private List<SoloDTO> toDTOList(List<Solo> soloList) {
        return soloList.stream().map(SoloDTO::new).collect(Collectors.toList());
    }    

}
