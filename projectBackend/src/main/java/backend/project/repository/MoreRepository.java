package backend.project.repository;

import backend.project.dto.MoreDto;
import backend.project.entity.More;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MoreRepository extends CrudRepository<More, Integer> {

    @Query( "select new backend.project.dto.MoreDto( b.product_name , b.costProduct , b.image, b.details) " +
            "from User a, Producto b, Cart  c " +
            "where a.user_id=c.user_id and c.product_id=b.product_id group by b.product_name, b.costProduct, b.image, b.details" +
            " order by sum (1) desc ")
    List<MoreDto>ObtenerMore();

}
