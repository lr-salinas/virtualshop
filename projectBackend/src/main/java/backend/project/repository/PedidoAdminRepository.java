package backend.project.repository;

import backend.project.dto.OrderDto;
import backend.project.dto.ReceiptDto;
import backend.project.entity.PedidoAdmin;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import javax.persistence.criteria.From;
import java.util.List;

public interface PedidoAdminRepository extends CrudRepository <PedidoAdmin, Integer>{

    @Query( "select new backend.project.dto.OrderDto(a.product_name,a.details, a.size, b.cantidad ) " +
            "from Producto a, PedidoAdmin b " +
            "where a.product_id = a.product_id and b.order_id=b.order_id ")
    List<OrderDto> ObtenerPedidos();
}
