package com.colheita.pa.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.colheita.pa.dto.regiaoDTO.InsertRegiaoDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.List;


import javax.persistence.JoinColumn;

@Entity
//@Table(name="TB_Regiao")
public class Regiao implements Serializable {
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private long id;
	 

	private String nomeRegiao;
	 
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name="Muda_Regiao",
	             joinColumns={@JoinColumn(name="MUDA_ID")},
	             inverseJoinColumns={@JoinColumn(name="REGIAO_ID")})
	 @JsonBackReference
	 private List<Muda> mudas;
	 


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nomeRegiao == null) ? 0 : nomeRegiao.hashCode());
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
		Regiao other = (Regiao) obj;
		if (id != other.id)
			return false;
		if (nomeRegiao == null) {
			if (other.nomeRegiao != null)
				return false;
		} else if (!nomeRegiao.equals(other.nomeRegiao))
			return false;
		return true;
	}



	public Regiao() {
	}



	public Regiao(InsertRegiaoDTO insertDTO) {
		this.nomeRegiao = insertDTO.getNomeRegiao();
	}



	public String getNomeRegiao() {
		return nomeRegiao;
	}


	 public long getId() {
			return id;
	}



		public void setId(long id) {
			this.id = id;
	}
		
		
	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}



	// public List<Muda> getMudas() {
	// 	return mudas;
	// }



	// public void setMudas(List<Muda> mudas) {
	// 	this.mudas = mudas;
	// }

	
	
}
