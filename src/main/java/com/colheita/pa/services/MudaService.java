package com.colheita.pa.services;

import java.util.ArrayList;
import java.util.List;

import com.colheita.pa.dto.MudaDTO;
import com.colheita.pa.entities.Muda;
import com.colheita.pa.repositories.MudaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MudaService {
    
    @Autowired
    private MudaRepository repo;

    public List<MudaDTO> getMudas(){

        List<Muda> mudaList = repo.getMudas();

        List<MudaDTO> mudaListDTO = new ArrayList<>();

        for(Muda c: mudaList){
            mudaListDTO.add(new MudaDTO(c.getId(), c.getRegiao(), c.getSolo(), c.getBioma(), 
                                        c.getEspecie(), c.getNomePopular1(), c.getNomePopular2(), c.getNomeCientifico(), c.isFrutifera()));
        }

        return mudaListDTO;
       
    }

}
