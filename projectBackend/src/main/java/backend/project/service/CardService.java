package backend.project.service;

import backend.project.entity.Card;
import backend.project.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public List<Card> SearchCards(){
        return (List<Card>) cardRepository.findAll();
    }

    public Optional<Card> getCardById(Integer id){
        return cardRepository.findById(id);
    }

    public void save(Card card){
        cardRepository.save(card);
    }

    public void update(Card card) {
        cardRepository.save(card);
    }

    public void deleteCard(int id){
        cardRepository.deleteById(id);
    }



}
