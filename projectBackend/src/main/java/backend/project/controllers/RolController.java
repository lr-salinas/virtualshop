package backend.project.controllers;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

import backend.project.entity.Rol;
import backend.project.service.RolService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/rol")

public class RolController {
    @Autowired
    private RolService rolService;

    @Operation(summary = "Get a rol by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the rol",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Rol.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Rol not found",
                    content = @Content) })

    //	OBTENER ROL POR ID
    @GetMapping("/{id}")
    public Optional<Rol> getById (@Parameter(description = "id of rol to be searched")
                                  @PathVariable Integer id) {

        return (Optional<Rol>) rolService.getById(id);
    }


    @Operation(summary = "Get rol list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the rol",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Rol.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Rol not found",
                    content = @Content) })
    //	OBTENER TODAS LOS ROLES
    @GetMapping
    public List<Rol> ListarTodos() {

        return rolService.BuscarTodos();
    }

}

