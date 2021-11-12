package backend.project.repository;

import backend.project.dto.CartDto;
import backend.project.dto.ReceiptDto;
import backend.project.entity.Cart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    @Query( "select new backend.project.dto.CartDto(a.name,a.lastname, b.product_name , b.costProduct , b.image) " +
            "from User a, Producto b, Cart  c " +
            "where a.user_id=c.user_id and c.product_id=b.product_id  ")
    List<CartDto>ObtenerCompra();


}
