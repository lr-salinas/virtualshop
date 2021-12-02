package backend.project.repository;

import backend.project.dto.OrderDto;
import backend.project.dto.ReceiptDto;
import backend.project.entity.PedidoAdmin;
import org.assertj.core.internal.bytebuddy.TypeCache;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import javax.persistence.criteria.From;
import java.util.List;

public interface PedidoAdminRepository extends CrudRepository <PedidoAdmin, Integer> {
}
