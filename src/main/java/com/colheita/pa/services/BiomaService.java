package com.colheita.pa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.colheita.pa.dto.biomaDTO.BiomaDTO;
import com.colheita.pa.dto.biomaDTO.InsertBiomaDTO;
import com.colheita.pa.entities.Bioma;
import com.colheita.pa.repositories.BiomaRepository;

@Service
public class BiomaService {
    
    @Autowired
    private BiomaRepository repo;

    public List<BiomaDTO> getBiomas(){
        
        List<Bioma> biomaList = repo.findAll();
        
        return toDTOList(biomaList);

    }

    public BiomaDTO getBiomaByID(Long id){

        Optional <Bioma> op = repo.findById(id);
        Bioma bioma = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Plant not found"));

        return new BiomaDTO(bioma);

    }

    public BiomaDTO insert(InsertBiomaDTO insertDTO){
        
        Bioma entity = new Bioma(insertDTO);
        entity = repo.save(entity);

        return new BiomaDTO(entity);

    }

    public void delete(Long id){

        try{
            repo.deleteById(id);
        }
        catch(EmptyResultDataAccessException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Bioma not found");
        }
    }

    private List<BiomaDTO> toDTOList(List<Bioma> biomaList) {
        return biomaList.stream().map(BiomaDTO::new).collect(Collectors.toList());
    }

}
