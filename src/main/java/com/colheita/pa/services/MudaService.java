package com.colheita.pa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.colheita.pa.dto.MudaDTO;
import com.colheita.pa.dto.UpdateMudaDTO;
import com.colheita.pa.dto.InsertMudaDTO;
import com.colheita.pa.entities.Muda;
import com.colheita.pa.repositories.MudaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MudaService {
    
    @Autowired
    private MudaRepository repo;

    // devolve todas as mudas
    public List<MudaDTO> getMudas(){

        List<Muda> mudaList = repo.findAll();

        return toDTOList(mudaList);
       
    }

    // recupera muda pelo ID
    public MudaDTO getMudaByID(long id){
        
        Optional <Muda> op = repo.findById(id);
        Muda muda = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Plant not found"));
        
        return new MudaDTO(muda);

    }

    public MudaDTO insert(InsertMudaDTO insertDTO){
        
        Muda entity = new Muda(insertDTO);
        entity = repo.save(entity);

        return new MudaDTO(entity);

    }

    public void delete(Long id){
       
        try{
           repo.deleteById(id);
       }
       catch (EmptyResultDataAccessException e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Event not found");
       }

    }

    public MudaDTO update(Long id, UpdateMudaDTO updateDTO){
        
        Muda entity = repo.getOne(id);
        try{
            
            entity.setFrutifera(updateDTO.isFrutifera());
            entity.setBioma(updateDTO.getBioma());
            entity.setSolo(updateDTO.getSolo());
            entity.setRegiao(updateDTO.getRegiao());
            entity.setEspecie(updateDTO.getEspecie());
            entity = repo.save(entity);
        }
        catch(EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Event not found");
        }

        return new MudaDTO(entity);

    }
    


    // metodo que tramsforma Muda em MudaDTO
    private List<MudaDTO> toDTOList(List<Muda> list){
        List<MudaDTO> mudaListDTO = new ArrayList<>();

        for(Muda c: list){
            mudaListDTO.add(new MudaDTO(c.getId(), c.getRegiao(), c.getSolo(), c.getBioma(), 
                                        c.getEspecie(), c.getNomePopular1(), c.getNomePopular2(), 
                                        c.getNomeCientifico(), c.isFrutifera()));
        }

        return mudaListDTO;
    }

}
