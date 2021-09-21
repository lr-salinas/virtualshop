package backend.project.repository;

import backend.project.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface MediaRepository extends CrudRepository <Producto, Integer> {
}
