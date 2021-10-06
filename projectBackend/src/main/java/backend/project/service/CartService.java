package backend.project.service;

import backend.project.entity.Cart;
import backend.project.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> SearchProd (){
        return (List<Cart>) cartRepository.findAll();
    }

    public void save(Cart cart){
        cartRepository.save(cart);
    }

    public void delete (int id){
        cartRepository.deleteById(id);
    }
}
