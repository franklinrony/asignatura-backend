package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.academiadecodigo.asignatura.backend.entities.Alumno;
import net.academiadecodigo.asignatura.backend.repository.AlumnoRepository;
@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public Alumno registrar(Alumno obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno modificar(Alumno obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> listar() throws ServiceException {
		
		return alumnoRepository.findAll();
	}

	@Override
	public Optional<Alumno> leerPorId(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean eliminar(Alumno obj) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
