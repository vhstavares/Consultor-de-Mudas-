package com.colheita.pa.controllers;

import java.net.URI;
import java.util.List;

import com.colheita.pa.dto.biomaDTO.InsertBiomaDTO;
import com.colheita.pa.dto.biomaDTO.BiomaDTO;
import com.colheita.pa.services.BiomaService;

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
@RequestMapping("/biomas")
@CrossOrigin
public class BiomaController {
    
    @Autowired
    private BiomaService service;

    @GetMapping     //WORKING
    public ResponseEntity<List<BiomaDTO>> getBiomas(){

        List <BiomaDTO> biomaList = service.getBiomas();

        return ResponseEntity.ok().body(biomaList);
        
    }

    @GetMapping("{id}")    //WORKING
    public ResponseEntity<BiomaDTO> getBiomaByID(@PathVariable Long id){

        BiomaDTO dto = service.getBiomaByID(id);

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping           
    public ResponseEntity<BiomaDTO> insert(@RequestBody InsertBiomaDTO insertDTO){
    
        BiomaDTO dto = service.insert(insertDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);

    }

    @DeleteMapping("{id}")      
    public ResponseEntity<Void> delete(@PathVariable Long id){

        service.delete(id);

        return ResponseEntity.noContent().build();

    }

}
