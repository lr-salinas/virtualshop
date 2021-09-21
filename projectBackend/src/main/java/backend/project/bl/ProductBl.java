package backend.project.bl;

import backend.project.dao.MediaDao;
import backend.project.dao.ProductDao;
import backend.project.dao.TransactionDao;
import backend.project.model.Product;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ProductBl {
    private ProductDao productDao;
    private TransactionDao transactionDao;

    @Autowired
    public ProductBl(ProductDao productDao, TransactionDao transactionDao){
        this.productDao = productDao;
        this.transactionDao = transactionDao;
    }

    public Product detailsByproductId (Integer productid){
        return productDao.productdetails(productid);
    }

    public List<Product>productlist(){
        return productDao.productlist();

    }

}
