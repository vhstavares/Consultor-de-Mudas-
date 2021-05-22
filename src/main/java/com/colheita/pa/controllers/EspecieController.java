package com.colheita.pa.controllers;

import java.net.URI;
import java.util.List;

import com.colheita.pa.dto.especieDTO.InsertEspecie;
import com.colheita.pa.dto.especieDTO.EspecieDTO;
import com.colheita.pa.services.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/especie") // rota para o front end
@CrossOrigin
public class EspecieController {
    
    @Autowired
    private EspecieService service;

    @GetMapping         //WORKING
    public ResponseEntity<List<EspecieDTO>> getEspecies(){
        
        List <EspecieDTO> especieList = service.getEspecie();

        return ResponseEntity.ok().body(especieList);
    }

    @GetMapping("{id}")         //WORKING
    public ResponseEntity<EspecieDTO> getEspecieByID(@PathVariable Long id){

        EspecieDTO dto = service.getEspecieByID(id);

        return ResponseEntity.ok().body(dto);

    }

    @PostMapping            //WORKING
    public ResponseEntity<EspecieDTO> insert(@RequestBody InsertEspecie insertDTO){
        
        EspecieDTO dto = service.insert(insertDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);

    }

    @DeleteMapping("{id}")      //WORKING
    public ResponseEntity<Void> delete(@PathVariable Long id){

        service.delete(id);

        return ResponseEntity.noContent().build();

    }
 


}
