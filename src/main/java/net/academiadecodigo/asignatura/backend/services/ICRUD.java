package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;

public interface ICRUD<T> {
	T registrar(T obj)  throws ServiceException;
	T modificar(T obj)  throws ServiceException;
	List<T> listar()  throws ServiceException;
	Optional<T> leerPorId(Integer id)  throws ServiceException;
	boolean eliminar(T obj) throws ServiceException;	
}
