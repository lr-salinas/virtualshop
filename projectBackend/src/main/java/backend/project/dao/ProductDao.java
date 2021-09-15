package backend.project.dao;

import backend.project.model.Product;

import java.util.List;

public interface ProductDao {
    public Product productdetails(Integer productId);
    public List<Product> productlist();
}
