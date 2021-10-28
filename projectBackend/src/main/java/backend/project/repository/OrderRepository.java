package backend.project.repository;

import backend.project.entity.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository <Order, Integer>{


}
