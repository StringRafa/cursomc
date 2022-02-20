package com.panambystudio.cursomc.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.panambystudio.cursomc.domain.Cidade;
import com.panambystudio.cursomc.domain.Estado;
import com.panambystudio.cursomc.dto.CidadeDTO;
import com.panambystudio.cursomc.dto.EstadoDTO;
import com.panambystudio.cursomc.services.CidadeService;
import com.panambystudio.cursomc.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService ;
	
	@Autowired
	private CidadeService cidadeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<EstadoDTO>> findAll(){
		List<Estado> list = estadoService.findAll();
		List<EstadoDTO> listDto = list.stream().map(obj -> new EstadoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{id}/cidades", method = RequestMethod.GET)
	public ResponseEntity<List<CidadeDTO>> findAllCidades(@PathVariable Integer id){
		List<Cidade> list = cidadeService.findByEstado(id);
		List<CidadeDTO> listDto = list.stream().map(obj -> new CidadeDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
