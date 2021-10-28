package backend.project.service;

import java.util.List;
import java.util.Optional;

import backend.project.entity.Order;
import backend.project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> BuscarTodos (){
        return (List<Order>) orderRepository.findAll();
    }

    public Optional<Order> getById(Integer id){
        return orderRepository.findById(id);
    }

    public void guardar (Order order) {
        orderRepository.save(order);
    }

    public void actualizar (Order order) {
        orderRepository.save(order);
    }

    public void eliminar (int id) {
        orderRepository.deleteById(id);
    }

}
