package backend.project.service;

import backend.project.dto.CartDto;
import backend.project.entity.Cart;
import backend.project.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> SearchProd (){
        return (List<Cart>) cartRepository.findAll();
    }

    public Optional<Cart> getById(Integer id){
        return cartRepository.findById(id);
    }


    public void save(Cart cart){
        cartRepository.save(cart);
    }

    public void delete (int id){
        cartRepository.deleteById(id);
    }

    public List<CartDto> ObtenerCompra()
    {
        List<CartDto> list= cartRepository.ObtenerCompra();
        list.forEach(l -> System.out.println(l));
        return list;

    }


}
