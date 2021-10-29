package backend.project.repository;

import backend.project.entity.PedidoAdmin;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import javax.persistence.criteria.From;

public interface PedidoAdminRepository extends CrudRepository <PedidoAdmin, Integer>{
}
