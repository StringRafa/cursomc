package com.panambystudio.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panambystudio.cursomc.domain.Cidade;
import com.panambystudio.cursomc.domain.Estado;
import com.panambystudio.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	public List<Cidade> find(Estado estado) {
		
//		UserSS user = UserService.authenticated();
//		if (user == null || !user.hasRole(Perfil.ADMIN) && !id.equals(user.getId())) {
//			throw new AuthorizationException("Acesso negado");
//		}
		
		List<Cidade> obj = cidadeRepository.findCidades(estado.getId());
		return obj;
	}
	
	public List<Cidade> findAll() {
		return cidadeRepository.findAll();
	}
}
