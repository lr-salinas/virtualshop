package backend.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.project.entity.Producto;
import backend.project.repository.ProductoRepository;

@Service

public class ProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> BuscarTodos (){
		return (List<Producto>) productoRepository.findAll();
	}

	public Optional<Producto> getById(Integer id){
		return productoRepository.findById(id);
	}
	
	public void guardar (Producto producto) {
		productoRepository.save(producto); 
	}

	public void actualizar (Producto producto) {
		productoRepository.save(producto);
	}
	
	public void eliminar (int id) {
		productoRepository.deleteById(id);
	}
	
	
	
}
