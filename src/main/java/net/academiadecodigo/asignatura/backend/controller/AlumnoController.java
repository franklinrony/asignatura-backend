package net.academiadecodigo.asignatura.backend.controller;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import net.academiadecodigo.asignatura.backend.entities.Alumno;
import net.academiadecodigo.asignatura.backend.services.AlumnoService;

@Slf4j
@RestController
@RequestMapping("alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping()
	public ResponseEntity<?> findAll() throws ServiceException{
		//return ResponseEntity.ok(clienteService.listar());
		
		try {
			List<Alumno> alumnos= alumnoService.listar();
			if ( alumnos.isEmpty() ) {
				return ResponseEntity.noContent().build();				
			}
			return  ResponseEntity.ok(alumnos);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}
}
