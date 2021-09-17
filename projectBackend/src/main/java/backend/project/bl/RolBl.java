package backend.project.bl;

import backend.project.dao.RolDao;
import backend.project.dao.TransactionDao;
import backend.project.dao.UserRolDao;
import backend.project.dto.RolRequest;
import backend.project.model.Rol;
import backend.project.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolBl {
    private RolDao rolDao;
    private UserRolDao userRolDao;
    private TransactionDao transactionDao;

    @Autowired
    public RolBl(RolDao rolDao, UserRolDao userRolDao, TransactionDao transactionDao){
        this.rolDao = rolDao;
        this.userRolDao = userRolDao;
        this.transactionDao = transactionDao;
    }

   /* public createNewRol(RolRequest rolRequest, Integer userid, Transaction transaction){
        Rol rol = new Rol();

        rol.setName(rolRequest.getRol());
        rol.setTransaction(transaction);
    }*/

}
