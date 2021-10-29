package backend.project.controllers;



import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import backend.project.entity.Rol;
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

import backend.project.entity.Receipt;
import backend.project.model.ReceiptModel;
import backend.project.service.ReceiptService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/receipt")

public class ReceiptController{
    @Autowired
    private ReceiptService receiptService;

    @Operation(summary = "Get receipt list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the receipt",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Receipt.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Receipt not found",
                    content = @Content) })
    @GetMapping
    public List<Receipt> ListarTodos() {

        return receiptService.BuscarTodos();
    }

    @Operation(summary = "Get a receipt by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the rol",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Receipt.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Receipt not found",
                    content = @Content) })

    @GetMapping("/{id}")
    public Optional<Receipt> getById (@Parameter(description = "id of receipt to be searched")
            @PathVariable Integer id) {

        return (Optional<Receipt>) receiptService.getById(id);
    }


    @Operation(summary = "Add new receipt")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the receipt",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Receipt.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Receipt not found",
                    content = @Content) })
    @PostMapping
    public Receipt guardarReceipt(@RequestBody Receipt receipt) throws ServerException {
        System.out.println(receipt);
        receiptService.guardar(receipt);
        if (receipt == null) {
            throw new ServerException(null);
        }
        else {
            return receipt;
        }
    }



}

