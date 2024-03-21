package net.academiadecodigo.asignatura.backend.controller;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import net.academiadecodigo.asignatura.backend.dto.MunicipioDto;
import net.academiadecodigo.asignatura.backend.entities.Municipio;
import net.academiadecodigo.asignatura.backend.services.MunicipioService;

@Slf4j
@RestController
@RequestMapping("municipios")
public class MunicipioController {

	@Autowired
	MunicipioService municipioService;
	
	@GetMapping()
	public ResponseEntity<?> findAll() throws ServiceException{
		//return ResponseEntity.ok(clienteService.listar());
		
		try {
			List<MunicipioDto> municipios= municipioService.listar();
			if ( municipios.isEmpty() ) {
				return ResponseEntity.noContent().build();				
			}
			return  ResponseEntity.ok(municipios);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}
}
