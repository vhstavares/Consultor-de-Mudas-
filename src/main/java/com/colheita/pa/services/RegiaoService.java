package com.colheita.pa.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.colheita.pa.dto.regiaoDTO.InsertRegiaoDTO;
import com.colheita.pa.dto.regiaoDTO.RegiaoDTO;
import com.colheita.pa.entities.Regiao;
import com.colheita.pa.repositories.RegiaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RegiaoService {
    
    @Autowired
    private RegiaoRepository repo;

    public List<RegiaoDTO> getRegioes(){
        
        List<Regiao> regiaoList = repo.findAll();

        return toDTOList(regiaoList);

    }

    public RegiaoDTO getRegiaoByID(long id){

        Optional <Regiao> op = repo.findById(id);
        Regiao regiao = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Plant not found"));
        
        return new RegiaoDTO(regiao);

    }

	public RegiaoDTO insert(InsertRegiaoDTO insertDTO) {
		
        Regiao entity = new Regiao(insertDTO);
        entity = repo.save(entity);

        return new RegiaoDTO(entity);
	}

    public void delete(Long id){

        try{
            repo.deleteById(id);
        }
        catch(EmptyResultDataAccessException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Regiao not found");
        }
    }

    private List<RegiaoDTO> toDTOList(List<Regiao> regiaoList) {
        return regiaoList.stream().map(RegiaoDTO::new).collect(Collectors.toList());
    }



}
