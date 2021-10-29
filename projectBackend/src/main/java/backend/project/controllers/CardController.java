package backend.project.controllers;

import backend.project.entity.Card;
import backend.project.entity.Cart;
import backend.project.entity.Categoria;
import backend.project.entity.User;
import backend.project.service.CardService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardService cardService;

    @Operation(summary = "Get card list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the card",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Card.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Card not found",
                    content = @Content) })
    //Obtener todas las tarjetas
    @GetMapping
    public List<Card> ListarCards(){
        return cardService.SearchCards();
    }



    @Operation(summary = "Get a card by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the card",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Card.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Card not found",
                    content = @Content) })
    //Obtener tarjeta por id
    @GetMapping("/{id}")
    public Optional<Card> getCardById (@Parameter(description = "id of card to be searched")
            @PathVariable Integer id){
        return (Optional<Card>) cardService.getCardById(id);
    }

    @Operation(summary = "Add new card")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the card",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Card.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Card not found",
                    content = @Content) })
    //agregar una nueva tarjeta
    @PostMapping
    public Card saveCard(@RequestBody Card card) throws ServerException{
        System.out.println(card);
        cardService.save(card);
        if (card == null){
            throw new ServerException(null);
        }else {
            return card;
        }
    }

    @Operation(summary = "Update card")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the card",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Card.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Card not found",
                    content = @Content) })
    //Actualizar tarjeta existente
    @PutMapping
    public void updateCard(@RequestBody Card card){
        cardService.update(card);
    }


    @Operation(summary = "Delete card")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the card",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Card.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Card not found",
                    content = @Content) })
    //Borrar tarjeta
    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable("id")int id){
        cardService.deleteCard(id);
    }
}
