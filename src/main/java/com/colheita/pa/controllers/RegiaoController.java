package com.colheita.pa.controllers;

import java.net.URI;
import java.util.List;

import com.colheita.pa.dto.regiaoDTO.InsertRegiaoDTO;
import com.colheita.pa.dto.regiaoDTO.RegiaoDTO;
import com.colheita.pa.services.RegiaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/regioes")
@CrossOrigin
public class RegiaoController {
    
    @Autowired
    private RegiaoService service;

    @GetMapping     //WORKING
    public ResponseEntity<List<RegiaoDTO>> getRegioes(){

        List <RegiaoDTO> regiaoList = service.getRegioes();

        return ResponseEntity.ok().body(regiaoList);
        
    }

    @GetMapping("{id}")    //WORKING
    public ResponseEntity<RegiaoDTO> getRegiaoByID(@PathVariable Long id){

        RegiaoDTO dto = service.getRegiaoByID(id);

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping           
    public ResponseEntity<RegiaoDTO> insert(@RequestBody InsertRegiaoDTO insertDTO){
    
        RegiaoDTO dto = service.insert(insertDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);

    }

    @DeleteMapping("{id}")      
    public ResponseEntity<Void> delete(@PathVariable Long id){

        service.delete(id);

        return ResponseEntity.noContent().build();

    }



    

}
