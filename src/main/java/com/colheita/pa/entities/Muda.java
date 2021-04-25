package com.colheita.pa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.colheita.pa.dto.InsertMudaDTO;

@Entity
@Table(name="TB_Muda")
public class Muda implements Serializable {
    
    private static final long serialVersionUID = 1L; // ver depois essa linha com o serializable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera PK automaticamente
    private long id;

    // dados para pesquisa front end 
    private String regiao;
    private String solo;
    private String bioma;
    private boolean frutifera;
    private String especie;

    // dados extras cientificos para mostrar ao usuario
    private String familia;
    private String subfamilia;
    private String genero;
    private String epiteto;
    private String variedade;
    private String nomePopular1;
    private String nomePopular2;
    private String nomeCientifico;

    public Muda() {
    }

    // cria uma nova entidade
    public Muda(InsertMudaDTO insertDTO) {
        this.regiao         = insertDTO.getRegiao();
        this.solo           = insertDTO.getSolo();
        this.bioma          = insertDTO.getBioma();
        this.frutifera      = insertDTO.isFrutifera();
        this.especie        = insertDTO.getEspecie();
        //this.familia      = insertDTO.getFamilia();  ???
        //this.subfamilia   = insertDTO.getSubfamilia(); ??? 
        //this.genero       = insertDTO.getGenero(); ???
        //this.epiteto      = insertDTO.getEpiteto(); ???
        ///this.variedade   = insertDTO.getVariedade() ???
        this.nomePopular1   = insertDTO.getNomePopular1();
        this.nomePopular2   = insertDTO.getNomePopular2();
        this.nomeCientifico = insertDTO.getNomeCientifico();
    }
    // get and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    public String getSolo() {
        return solo;
    }
    public void setSolo(String solo) {
        this.solo = solo;
    }
    public String getBioma() {
        return bioma;
    }
    public void setBioma(String bioma) {
        this.bioma = bioma;
    }
    public boolean isFrutifera() {
        return frutifera;
    }
    public void setFrutifera(boolean frutifera) {
        this.frutifera = frutifera;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public String getSubfamilia() {
        return subfamilia;
    }
    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEpiteto() {
        return epiteto;
    }
    public void setEpiteto(String epiteto) {
        this.epiteto = epiteto;
    }
    public String getVariedade() {
        return variedade;
    }
    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }
    public String getNomePopular1() {
        return nomePopular1;
    }
    public void setNomePopular1(String nomePopular1) {
        this.nomePopular1 = nomePopular1;
    }
    public String getNomePopular2() {
        return nomePopular2;
    }
    public void setNomePopular2(String nomePopular2) {
        this.nomePopular2 = nomePopular2;
    }
    public String getNomeCientifico() {
        return nomeCientifico;
    }
    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Muda other = (Muda) obj;
        if (id != other.id)
            return false;
        return true;
    }

    



}
