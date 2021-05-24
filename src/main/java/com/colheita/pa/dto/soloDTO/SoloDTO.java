package com.colheita.pa.dto.soloDTO;

import java.util.List;

import com.colheita.pa.entities.Muda;
import com.colheita.pa.entities.Solo;

public class SoloDTO {
    
    private long id;
    private String tipoSolo;
   // private List<Muda> mudas;

    public SoloDTO() {
    }

    public SoloDTO(long id, String tipoSolo) {
        this.id = id;
        this.tipoSolo = tipoSolo;
        //this.mudas = mudas;
    }

    public SoloDTO(Solo solo) {
    	this.id = solo.getId();
        this.tipoSolo = solo.getTipoSolo();
        //this.mudas = solo.getMudas();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

//    public List<Muda> getMudas() {
//        return mudas;
//    }
//
//    public void setMudas(List<Muda> mudas) {
//        this.mudas = mudas;
//    }

}
