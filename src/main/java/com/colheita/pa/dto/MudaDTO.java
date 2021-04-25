package com.colheita.pa.dto;

public class MudaDTO {

    public MudaDTO() {
    }

    public MudaDTO(long id, String regiao, String solo, String bioma, String especie, String nomePopular1,
            String nomePopular2, String nomeCientifico, boolean frutifera) {
            
                setId(id);
                setRegiao(regiao);
                setSolo(solo);
                setBioma(bioma);
                setEspecie(especie);
                setNomePopular1(nomePopular1);
                setNomePopular2(nomePopular2);
                setNomeCientifico(nomeCientifico);
                setFrutifera(frutifera);

    }

    // dados mostrados no front end para o usuario
    private long id;
    private String regiao;
    private String solo;
    private String bioma;
    private boolean frutifera;
    private String especie;
    private String nomePopular1;
    private String nomePopular2;
    private String nomeCientifico;
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
