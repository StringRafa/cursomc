package com.panambystudio.cursomc.dto;

import java.io.Serializable;

import com.panambystudio.cursomc.domain.Estado;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EstadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;

	public EstadoDTO(Estado obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
	}
	
}
