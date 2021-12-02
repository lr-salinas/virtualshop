package backend.project.service;

import backend.project.dto.OrderDto;
import backend.project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public List<OrderDto> ObtenerPedidos(){
        List<OrderDto> orderlist = orderRepository.ObtenerPedidos();
        orderlist.forEach(l -> System.out.println(l));
        return orderlist;
    }



}
