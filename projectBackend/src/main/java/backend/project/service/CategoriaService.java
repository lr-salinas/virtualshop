package backend.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.project.entity.Categoria;
import backend.project.repository.CategoriaRepository;

@Service

public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> BuscarTodos (){
		return (List<Categoria>) categoriaRepository.findAll();
	}

	public Optional<Categoria> getById(Integer id){
		return categoriaRepository.findById(id);
	}
	
	public void guardar (Categoria categoria) {
		categoriaRepository.save(categoria); 
	}

	public void actualizar (Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	public void eliminar (int id) {
		categoriaRepository.deleteById(id);
	}
	
	
	
}
