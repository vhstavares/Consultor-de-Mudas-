package com.colheita.pa.dto.soloDTO;

import java.util.ArrayList;
import java.util.List;
import com.colheita.pa.entities.Muda;

public class InsertSoloDTO {
    
    private long id;
    private String tipoSolo;
    private List<Muda> mudas;
    
    public InsertSoloDTO() {
    }

    public InsertSoloDTO(long id, String tipoSolo, List<Muda> mudas) {
        this.id = id;
        this.tipoSolo = tipoSolo;
        this.mudas = mudas;
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

    public List<Muda> getMudas() {
        return mudas;
    }

    public void setMudas(List<Muda> mudas) {
        this.mudas = mudas;
    }

    

}
