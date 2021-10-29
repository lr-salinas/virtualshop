package backend.project.controllers;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import backend.project.entity.Producto;
import backend.project.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

	@Operation(summary = "Get category list")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the category",
					content = { @Content(mediaType = "application/json",
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "400", description = "Invalid id supplied",
					content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found",
					content = @Content) })
//	OBTENER TODAS LAS CATEGORIAS
	@GetMapping
	public List<Categoria> ListarTodos() {
		
		return categoriaService.BuscarTodos();
	}

	@Operation(summary = "Get a category by its id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the category",
					content = { @Content(mediaType = "application/json",
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "400", description = "Invalid id supplied",
					content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found",
					content = @Content) })
	
//	OBTENER CATEGORIA POR ID
	@GetMapping("/{id}")
	public Optional<Categoria> getById (@Parameter(description = "id of category to be searched")
			@PathVariable Integer id) {
		
		return (Optional<Categoria>) categoriaService.getById(id);
	}

	@Operation(summary = "Add new category for the product")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the category",
					content = { @Content(mediaType = "application/json",
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "400", description = "Invalid id supplied",
					content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found",
					content = @Content) })
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

	@Operation(summary = "Update category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the category",
					content = { @Content(mediaType = "application/json",
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "400", description = "Invalid id supplied",
					content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found",
					content = @Content) })
//	ACTUALIZAR UNA CATEGORIA EXISTENTE
	@PutMapping
	public void actualizarCategoria(@RequestBody Categoria categoria) {
		categoriaService.actualizar(categoria);
	}


	@Operation(summary = "Delete category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the category",
					content = { @Content(mediaType = "application/json",
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "400", description = "Invalid id supplied",
					content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found",
					content = @Content) })
//	BORRAR UNA CATEGORIA
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") int id) {
		categoriaService.eliminar(id);
	}
	
	}
	
