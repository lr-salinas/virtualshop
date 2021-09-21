package backend.project.repository;

import org.springframework.data.repository.CrudRepository;

import backend.project.entity.Producto;

public interface ProductoRepository extends CrudRepository <Producto, Integer>{

}
