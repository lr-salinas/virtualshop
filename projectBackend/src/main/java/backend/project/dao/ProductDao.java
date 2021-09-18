package backend.project.dao;

import backend.project.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDao {
    public Product productdetails(Integer productId);
    public List<Product> productlist();
}
