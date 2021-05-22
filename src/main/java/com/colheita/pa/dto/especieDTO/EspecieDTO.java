package com.colheita.pa.dto.especieDTO;

import java.util.List;

import com.colheita.pa.entities.Especie;
import com.colheita.pa.entities.Muda;

public class EspecieDTO {
    
    private long id;
    private String nameEspecie;
    private List<Muda> mudas;

    
    public EspecieDTO() {
    }

    public EspecieDTO(long id, String nameEspecie, List<Muda> mudas) {
        this.id = id;
        this.nameEspecie = nameEspecie;
        this.mudas = mudas;
    }
    
    public EspecieDTO(Especie especie) {
        this.nameEspecie = especie.getNameEspecie();
        this.mudas = especie.getMudas();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNameEspecie() {
        return nameEspecie;
    }
    public void setNameEspecie(String nameEspecie) {
        this.nameEspecie = nameEspecie;
    }
    public List<Muda> getMudas() {
        return mudas;
    }
    public void setMudas(List<Muda> mudas) {
        this.mudas = mudas;
    }
    
}
