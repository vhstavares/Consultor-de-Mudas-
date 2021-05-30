package com.colheita.pa.dto.regiaoDTO;

import java.util.ArrayList;
import java.util.List;

import com.colheita.pa.entities.Muda;
import com.colheita.pa.entities.Regiao;

public class RegiaoDTO {
    
    private long id;
    private String nomeRegiao;
    private List<Muda> mudas = new ArrayList<>();

    public RegiaoDTO() {
    }

    public RegiaoDTO(long id, String nomeRegiao, List<Muda> mudas) {
        this.id = id;
        this.nomeRegiao = nomeRegiao;
        this.mudas = mudas;
    }

    public RegiaoDTO(Regiao regiao) {
    	this.id = regiao.getId();
        this.nomeRegiao = regiao.getNomeRegiao();
        this.mudas = regiao.getMudas();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNomeRegiao() {
        return nomeRegiao;
    }
    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }
    public List<Muda> getMudas() {
        return mudas;
    }
    public void setMudas(List<Muda> mudas) {
        this.mudas = mudas;
    }

}
