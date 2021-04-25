package com.colheita.pa.controllers;


import java.util.List;

import com.colheita.pa.dto.MudaDTO;
import com.colheita.pa.services.MudaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// regras de negocio da aplicação

@RestController
@RequestMapping("/mudas") // rota para o front end
public class MudaController {
    
    @Autowired // evita nullException no MudaService
    private MudaService service;

    @GetMapping 
    public ResponseEntity<List<MudaDTO>> getMudas(){
        
        List <MudaDTO> mudaList = service.getMudas();

        return ResponseEntity.ok().body(mudaList);
    }

}
