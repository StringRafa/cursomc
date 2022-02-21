package com.panambystudio.cursomc.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CredenciaisDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String email;
	private String senha;
	
}
