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

import backend.project.entity.Rol;
import backend.project.service.RolService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/rol")

public class RolController {
    @Autowired
    private RolService rolService;


    //	OBTENER TODAS LAS ROL
    @GetMapping
    public List<Rol> ListarTodos() {

        return rolService.BuscarTodos();
    }



    //	OBTENER ROL POR ID
    @GetMapping("/{id}")
    public Optional<Rol> getById (@PathVariable Integer id) {

        return (Optional<Rol>) rolService.getById(id);
    }




}

