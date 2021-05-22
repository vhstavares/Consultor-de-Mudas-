package com.colheita.pa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.colheita.pa.dto.InsertMudaDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
//@Table(name="TB_Muda")
public class Muda implements Serializable {
    
    private static final long serialVersionUID = 1L; // ver depois essa linha com o serializable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera PK automaticamente
    private long id;


    private boolean frutifera;
    private String nomeMuda;
    
    @ManyToMany(mappedBy="mudas", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Regiao> regioes;
    


    public Muda() {
    	super();
    }

    public Muda(InsertMudaDTO insertDTO) {
        
    }
    
    
    // cria uma nova entidad

    

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    public List<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(List<Regiao> regioes) {
		this.regioes = regioes;
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

	public boolean isFrutifera() {
		return frutifera;
	}

	public void setFrutifera(boolean frutifera) {
		this.frutifera = frutifera;
	}

	public String getNomeMuda() {
		return nomeMuda;
	}

	public void setNomeMuda(String nomeMuda) {
		this.nomeMuda = nomeMuda;
	}

    



}
