package backend.project.service;

import backend.project.dto.OrderDto;
import backend.project.entity.PedidoAdmin;
import backend.project.repository.PedidoAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoAdminService {
    @Autowired
    private PedidoAdminRepository pedidoAdminRepository;

 /*   public List<PedidoAdmin> BuscarTodos (){
        return (List<PedidoAdmin>) pedidoAdminRepository.findAll();
    }*/

    public Optional<PedidoAdmin> getById(Integer id){
        return pedidoAdminRepository.findById(id);
    }

    public void guardar(PedidoAdmin pedidoAdmin) {
        pedidoAdminRepository.save(pedidoAdmin);
    }

    public void actualizar (PedidoAdmin pedidoAdmin) {
        pedidoAdminRepository.save(pedidoAdmin);
    }

    public void eliminar (int id) {
        pedidoAdminRepository.deleteById(id);
    }

    public List<OrderDto>ObtenerPedidos(){
        List<OrderDto> orderlist = pedidoAdminRepository.ObtenerPedidos();
        orderlist.forEach(l -> System.out.println(l));
        return orderlist;
    }

    public  Optional<PedidoAdmin> SearchPedido(int id){
        return pedidoAdminRepository.findById(id);
    }


}
