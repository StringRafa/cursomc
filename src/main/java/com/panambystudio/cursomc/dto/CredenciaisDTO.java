package com.panambystudio.cursomc.dto;

import java.io.Serializable;

public class CredenciaisDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String usarname;
	private String senha;
	
	public CredenciaisDTO() {
	}

	public String getUsarname() {
		return usarname;
	}

	public void setUsarname(String usarname) {
		this.usarname = usarname;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
