package com.colheita.pa.repositories;

import java.util.ArrayList;
import java.util.List;

import com.colheita.pa.entities.Muda;

import org.springframework.stereotype.Component;

@Component
public class MudaRepository {
    
    public List <Muda> getMudas(){
        
        Muda c1 = new Muda();
        c1.setId(1L);
        c1.setBioma("Teste Bioma");
        c1.setEpiteto("Teste Epiteto");
        c1.setEspecie("especie");
        c1.setFamilia("familia");
        c1.setFrutifera(true);
        c1.setGenero("genero");
        c1.setNomeCientifico("nomeCientifico");
        c1.setNomePopular1("nomePopular1");
        c1.setNomePopular2("nomePopular2");
        c1.setRegiao("regiao");
        c1.setSolo("solo");
        c1.setSubfamilia("subfamilia");
        c1.setVariedade("variedade");

        Muda c2 = new Muda();
        c2.setId(2L);
        c2.setBioma("Teste Bioma 2");
        c2.setEpiteto("Teste Epiteto 2");
        c2.setEspecie("especie 2");
        c2.setFamilia("familia 2");
        c2.setFrutifera(true);
        c2.setGenero("genero 2");
        c2.setNomeCientifico("nomeCientifico 2");
        c2.setNomePopular1("nomePopular1 2");
        c2.setNomePopular2("nomePopular2 2");
        c2.setRegiao("regiao 2");
        c2.setSolo("solo 2");
        c2.setSubfamilia("subfamilia 2");
        c2.setVariedade("variedade 2");

        List<Muda> mudaList = new ArrayList<>();
        mudaList.add(c1);
        mudaList.add(c2);

        return mudaList;
    }

}
