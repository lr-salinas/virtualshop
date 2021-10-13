package backend.project.controllers;

import backend.project.entity.Card;
import backend.project.service.CardService;
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

    //Obtener todas las tarjetas
    @GetMapping
    public List<Card> ListarCards(){
        return cardService.SearchCards();
    }

    //Obtener tarjeta por id
    @GetMapping("/{id}")
    public Optional<Card> getCardById (@PathVariable Integer id){
        return (Optional<Card>) cardService.getCardById(id);
    }

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

    //Actualizar tarjeta existente
    @PutMapping
    public void updateCard(@RequestBody Card card){
        cardService.update(card);
    }

    //Borrar tarjeta
    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable("id")int id){
        cardService.deleteCard(id);
    }
}
