package com.colheita.pa.dto;

import java.util.ArrayList;
import java.util.List;

import com.colheita.pa.entities.Muda;
import com.colheita.pa.entities.Regiao;

public class MudaDTO {

	private long id;
    private boolean frutifera;
    private String nomeMuda;
    private List<Regiao> regioes = new ArrayList<>();

    public MudaDTO(long id, boolean frutifera, String nomeMuda, ArrayList<Regiao> regioes) {
		this.id = id;
		this.frutifera = frutifera;
		this.nomeMuda = nomeMuda;
		this.regioes = regioes;
	}

	public MudaDTO() {
    	
    }

	public MudaDTO(Muda muda) {
		this.frutifera = muda.isFrutifera();
		this.nomeMuda = muda.getNomeMuda();
		this.regioes = muda.getRegioes();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public List<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(ArrayList<Regiao> regioes) {
		this.regioes = regioes;
	}

    
}
