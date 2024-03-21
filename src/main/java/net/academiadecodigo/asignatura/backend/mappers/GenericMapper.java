package net.academiadecodigo.asignatura.backend.mappers;

public interface GenericMapper<D,E> {
	    
		E toEntity(D objectDto);
	    
		D toDTO(E object);
}
