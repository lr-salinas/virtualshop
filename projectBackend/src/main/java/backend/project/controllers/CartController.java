package backend.project.controllers;

import backend.project.entity.Cart;
import backend.project.entity.Producto;
import backend.project.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cart")

public class CartController {
    @Autowired
    private CartService cartService;

    //	Obtener lista de productos
    @GetMapping
    public List<Cart> ListarProd() {

        return cartService.SearchProd();
    }

    //	Agregar producto al carrito
    @PostMapping
    public Cart saveProd(@RequestBody Cart cart) throws ServerException {
        System.out.println(cart);
        cartService.save(cart);
        if (cart == null) {
            throw new ServerException(null);
        }
        else {
            return cart;
        }
    }

    //	Borrar producto del carrito
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {

        cartService.delete(id);
    }




}
