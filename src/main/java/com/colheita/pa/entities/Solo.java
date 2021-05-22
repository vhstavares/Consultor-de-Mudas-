package com.colheita.pa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.JoinColumn;

import com.colheita.pa.dto.soloDTO.InsertSoloDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Solo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera PK automaticamente
    private long id;

    private String tipoSolo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="Muda_Solo",
                joinColumns={@JoinColumn(name="MUDA_ID")},
                inverseJoinColumns={@JoinColumn(name="SOLO_ID")})
    @JsonBackReference
    private List<Muda> mudas;

    public Solo(long id, String tipoSolo, List<Muda> mudas) {
        this.id = id;
        this.tipoSolo = tipoSolo;
        this.mudas = mudas;
    }

    public Solo() {
    }

    public Solo(InsertSoloDTO insertDTO) {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((mudas == null) ? 0 : mudas.hashCode());
        result = prime * result + ((tipoSolo == null) ? 0 : tipoSolo.hashCode());
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
        Solo other = (Solo) obj;
        if (id != other.id)
            return false;
        if (mudas == null) {
            if (other.mudas != null)
                return false;
        } else if (!mudas.equals(other.mudas))
            return false;
        if (tipoSolo == null) {
            if (other.tipoSolo != null)
                return false;
        } else if (!tipoSolo.equals(other.tipoSolo))
            return false;
        return true;
    }

}
