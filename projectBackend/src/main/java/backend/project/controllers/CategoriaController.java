package backend.project.controllers;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.project.entity.Categoria;
import backend.project.service.CategoriaService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/categoria")

public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	
//	OBTENER TODAS LAS CATEGORIAS
	@GetMapping
	public List<Categoria> ListarTodos() {
		
		return categoriaService.BuscarTodos();
	}

	
//	OBTENER CATEGORIA POR ID
	@GetMapping("/{id}")
	public Optional<Categoria> getById (@PathVariable Integer id) {
		
		return (Optional<Categoria>) categoriaService.getById(id);
	}
	
	
//	AGREGAR UNA NUEVA CATEGORIA
	@PostMapping
	public Categoria guardarCategoria(@RequestBody Categoria categoria) throws ServerException {
		System.out.println(categoria);
		categoriaService.guardar(categoria);	
		if (categoria == null) {
	        throw new ServerException(null);
	    } 
		else {
	        return categoria;
	    }
	}	
	
//	ACTUALIZAR UNA CATEGORIA EXISTENTE
	@PutMapping
	public void actualizarCategoria(@RequestBody Categoria categoria) {
		categoriaService.actualizar(categoria);
	}
	
	
//	BORRAR UNA CATEGORIA
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") int id) {
		categoriaService.eliminar(id);
	}
	
	}
	
