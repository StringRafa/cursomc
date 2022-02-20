package com.panambystudio.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panambystudio.cursomc.domain.Cliente;
import com.panambystudio.cursomc.domain.Estado;
import com.panambystudio.cursomc.repositories.EstadoRepository;
import com.panambystudio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public Estado find(Integer id) {
//		Estado obj = estadoRepository.findAllByOrderByNome();
//		if (obj == null) {
//			throw new ObjectNotFoundException(
//					"Objeto não encontrado! Id: " + obj.getId() + ", Tipo: " + Estado.class.getName());
//		}
//		return obj;
		Optional<Estado> obj = estadoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}
}
