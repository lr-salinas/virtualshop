package backend.project.controllers;

import backend.project.dto.CartDto;
import backend.project.dto.ClientDto;
import backend.project.dto.MoreDto;
import backend.project.entity.Cart;
import backend.project.entity.Categoria;
import backend.project.entity.Producto;
import backend.project.entity.User;
import backend.project.service.CartService;
import backend.project.service.ClientService;
import backend.project.service.MoreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")

public class ClientController{
    @Autowired
    private ClientService clientService;

    @RequestMapping("/client")
    @GetMapping
    public ResponseEntity<List<ClientDto>> getDeptEmployeesInnerJoin() {
        return new ResponseEntity<List<ClientDto>>(clientService.ObtenerCliente(), HttpStatus.OK);
    }


}


