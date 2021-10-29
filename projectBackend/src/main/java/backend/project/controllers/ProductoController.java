package backend.project.controllers;

import java.awt.print.Book;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
//	OBTENER TODOS LOS PRODUCTOS

	@GetMapping
	public List<Producto> ListarTodos() {
		
		return productoService.BuscarTodos();
	}

	//	OBTENER PRODUCTO POR ID
	@GetMapping("/{id}")
	public Optional<Producto> getById (@PathVariable Integer id) {
		
		return (Optional<Producto>) productoService.getById(id);
	}
	
	
//	AGREGAR UN NUEVO PRODUCTO
	@PostMapping
	public Producto guardarProducto(@RequestBody Producto producto) throws ServerException {
		System.out.println(producto);
		productoService.guardar(producto);	
		if (producto == null) {
	        throw new ServerException(null);
	    } 
		else {
	        return producto;
	    }
	}	
	
//	ACTUALIZAR UN PRODUCTO EXISTENTE
	@PutMapping
	public void actualizarProducto(@RequestBody Producto producto) {
		productoService.actualizar(producto);
	}
	
	
//	BORRAR UN PRODUCTO
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") int id) {
		productoService.eliminar(id);
	}
	
	

//	@PostMapping
////		 
//	public ProductoModel PruebaPost(@RequestBody ProductoModel entrada) {
//	ProductoModel p = entrada; p.setProduct_name("Roxana Vargas"); return p; }
////	 
//	 @GetMapping("/buscar") public String BuscarAlgo() { 
//		 return "Otra Prueba GET";
//	 }
//	 

}
	
