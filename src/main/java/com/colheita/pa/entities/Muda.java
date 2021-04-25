package com.colheita.pa.entities;

public class Muda {
    
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

    



}
