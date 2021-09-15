package backend.project.api;

import backend.project.bl.ProductBl;
import backend.project.bl.TransactionBl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductApi {

    private TransactionBl transactionBl;
    private ProductBl productBl;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductApi.class);

    @Autowired
    public ProductApi(TransactionBl transactionBl,ProductBl productBl){
        this.transactionBl = transactionBl;
        this.productBl = productBl;
    }


}
