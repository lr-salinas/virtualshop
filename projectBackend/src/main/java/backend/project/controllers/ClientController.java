package backend.project.controllers;

import backend.project.dto.CartDto;
import backend.project.dto.ClientDto;
import backend.project.dto.MoreDto;
import backend.project.entity.*;
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

    @Operation(summary = "Get client list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the client",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Client.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Client not found",
                    content = @Content) })

    @RequestMapping("/client")
    @GetMapping
    public ResponseEntity<List<ClientDto>> getDeptEmployeesInnerJoin() {
        return new ResponseEntity<List<ClientDto>>(clientService.ObtenerCliente(), HttpStatus.OK);
    }


}


