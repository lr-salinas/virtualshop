package backend.project.bl;

import backend.project.dao.ProductDao;
import backend.project.dao.TransactionDao;
import backend.project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBl {
    private TransactionDao transactionDao;
    private ProductDao productDao;

    @Autowired
    public ProductBl(TransactionDao transactionDao, ProductDao productDao){
        this.transactionDao = transactionDao;
        this.productDao = productDao;

    }

    public Product detailsByproductId (Integer productid){
        //Product p = productDao.productdetails(productid);
        return productDao.productdetails(productid);
    }

    public List<Product>productlist(){
        return productDao.productlist();

    }

}
