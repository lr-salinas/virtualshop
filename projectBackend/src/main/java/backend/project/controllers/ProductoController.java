package backend.project.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.project.entity.Producto;
import backend.project.model.ProductoModel;
import backend.project.service.ProductoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/producto")

public class ProductoController{
	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	public List<Producto> ListarTodos() {
		
		return productoService.BuscarTodos();
	}

	@GetMapping("/{id}")
	public Optional<Producto> getById (@PathVariable Integer id) {
		
		return (Optional<Producto>) productoService.getById(id);
	}

	
//	 @PostMapping
//	 
//	 public ProductoModel PruebaPost(@RequestBody ProductoModel entrada) {
//	 ProductoModel p = entrada; p.setNombre("Roxana Vargas"); return p; }
//	 
//	 @GetMapping("/buscar") public String BuscarAlgo() { 
//		 return "Otra Prueba GET";
//	 }
//	 

}