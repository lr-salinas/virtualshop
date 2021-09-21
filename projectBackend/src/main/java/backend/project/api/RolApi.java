package backend.project.api;

import backend.project.bl.RolBl;
import backend.project.bl.TransactionBl;
import backend.project.dto.RolRequest;
import backend.project.model.Rol;
import backend.project.model.Transaction;
import backend.project.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/rol")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RolApi {
    private RolBl rolBl;
    private TransactionBl transactionBl;

    @Autowired
    public RolApi(RolBl rolBl, TransactionBl transactionBl){
        this.rolBl = rolBl;
        this.transactionBl = transactionBl;
    }

    @RequestMapping(value = "/userRol/{userid}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Rol createnewrol(@RequestBody RolRequest rolRequest, @PathVariable("userid") Integer id, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        Rol rolResponse = rolBl.createNewRol(rolRequest,id,transaction);
        return rolResponse;
    }

}
