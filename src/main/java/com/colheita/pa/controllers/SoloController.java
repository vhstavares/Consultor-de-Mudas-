package com.colheita.pa.controllers;

import java.net.URI;
import java.util.List;

import com.colheita.pa.dto.soloDTO.SoloDTO;
import com.colheita.pa.dto.soloDTO.InsertSoloDTO;
import com.colheita.pa.services.SoloService;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/solos") // rota para o front end
@CrossOrigin
public class SoloController {
    
    @Autowired
    private SoloService service;

    @GetMapping         //WORKING
    public ResponseEntity<List<SoloDTO>> getSolos(){
        
        List <SoloDTO> soloList = service.getSolos();

        return ResponseEntity.ok().body(soloList);
    }
    

    @GetMapping("{id}")         //WORKING
    public ResponseEntity<SoloDTO> getSoloByID(@PathVariable Long id){

        SoloDTO dto = service.getSoloByID(id);

        return ResponseEntity.ok().body(dto);

    }

    @PostMapping            //WORKING
    public ResponseEntity<SoloDTO> insert(@RequestBody InsertSoloDTO insertDTO) throws Exception {
        
        SoloDTO dto = service.insert(insertDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);

    }

    @DeleteMapping("{id}")      //WORKING
    public ResponseEntity<Void> delete(@PathVariable Long id){

        service.delete(id);

        return ResponseEntity.noContent().build();

    }
}
