package backend.project.bl;

import backend.project.dao.RolDao;
import backend.project.dao.TransactionDao;
import backend.project.dao.UserRolDao;
import backend.project.dto.RolRequest;
import backend.project.model.Rol;
import backend.project.model.Transaction;
import backend.project.model.UserRol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolBl {
    private RolDao rolDao;
    private UserRolDao userRolDao;
    private TransactionDao transactionDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(RolBl.class);

    @Autowired
    public RolBl(RolDao rolDao, UserRolDao userRolDao, TransactionDao transactionDao){
        this.rolDao = rolDao;
        this.userRolDao = userRolDao;
        this.transactionDao = transactionDao;
    }

    public Rol createNewRol(RolRequest rolRequest, Integer userid, Transaction transaction){
        Rol rol = new Rol();

        rol.setName(rolRequest.getRol());
        rol.setTransaction(transaction);

        rolDao.createRol(rol);
        Integer rolid = rolDao.getLastIdRol();
        LOGGER.info("idrol: "+rolid);

        UserRol userrol = new UserRol();
        userrol.setUserId(userid);
        userrol.setRolId(rolid);
        LOGGER.info(userrol.toString());
        userRolDao.createUserRol(userrol);

        return rol;
    }
}
