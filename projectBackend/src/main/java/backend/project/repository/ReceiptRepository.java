package backend.project.repository;

import backend.project.dto.ReceiptDto;
import backend.project.entity.Receipt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ReceiptRepository extends CrudRepository <Receipt, Integer>{

    @Query( "select new backend.project.dto.ReceiptDto(a.name,a.lastname, b.product_name , b.costProduct, c.date ) " +
            "from User a, Producto b, Receipt  c " +
            "where a.user_id=c.user_id and c.product_id=b.product_id  ")
    List<ReceiptDto>ObtenerRecibos();

}
