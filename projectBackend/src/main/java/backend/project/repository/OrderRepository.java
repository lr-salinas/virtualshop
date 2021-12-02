package backend.project.repository;

import backend.project.dto.OrderDto;
import backend.project.entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository <Order,Integer> {
    @Query( "select new backend.project.dto.OrderDto(a.product_name,a.details, a.size, b.cantidad ) " +
            "from Producto a, PedidoAdmin b " +
            "where a.product_id = a.product_id and b.order_id=b.order_id ")
    List<OrderDto> ObtenerPedidos();
}
