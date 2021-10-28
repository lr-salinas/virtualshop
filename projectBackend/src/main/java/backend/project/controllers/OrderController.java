package backend.project.controllers;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import backend.project.entity.Order;
import backend.project.service.OrderService;
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

import backend.project.entity.Producto;
import backend.project.model.ProductoModel;
import backend.project.service.ProductoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/order")

public class OrderController{
    @Autowired
    private OrderService orderService;


    @GetMapping
    public List<Order> ListarTodos() {

        return orderService.BuscarTodos();
    }


    @GetMapping("/{id}")
    public Optional<Order> getById (@PathVariable Integer id) {

        return (Optional<Order>) orderService.getById(id);
    }

    @PostMapping
    public Order guardarOrder(@RequestBody Order order) throws ServerException {
        System.out.println(order);
        orderService.guardar(order);
        if (order == null) {
            throw new ServerException(null);
        }
        else {
            return order;
        }
    }


    @PutMapping
    public void actualizarOrder(@RequestBody Order order) {
        orderService.actualizar(order);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        orderService.eliminar(id);
    }



//	@PostMapping
////
//	public ProductoModel PruebaPost(@RequestBody ProductoModel entrada) {
//	ProductoModel p = entrada; p.setProduct_name("Roxana Vargas"); return p; }
////
//	 @GetMapping("/buscar") public String BuscarAlgo() {
//		 return "Otra Prueba GET";
//	 }
//

}
