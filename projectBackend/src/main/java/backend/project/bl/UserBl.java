package backend.project.bl;

import backend.project.dao.TransactionDao;
import backend.project.dao.UserDao;
import backend.project.dto.UserUpdate;
import backend.project.model.Transaction;
import backend.project.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class UserBl {
    private UserDao userDao;
    private TransactionDao transactionDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserBl.class);

    @Autowired
    public UserBl(UserDao userDao, TransactionDao transactionDao){
        this.userDao = userDao;
        this.transactionDao = transactionDao;
    }

    public User updateUser(@Valid UserUpdate userUpdate, Integer id, Transaction transaction){
        User user = new User();
        if(existe(userUpdate.getUsername(),id)==false){
            user.setUserId(id);
            user.setAddressId(userUpdate.getAddressId());
            user.setName(userUpdate.getName());
            user.setLastname(userUpdate.getLastname());
            user.setEmail(userUpdate.getEmail());
            user.setCellphone(userUpdate.getCellphone());
            user.setTelephone(userUpdate.getTelephone());
            user.setUsername(userUpdate.getUsername());
            user.setPassword(userUpdate.getPassword());

            if (user.getName().trim().length()==0 || user.getLastname().trim().length()==0|| user.getUsername().trim().length()==0){
                return null;
            }else{
                userDao.updateUser(user);
                return user;
            }
        }else{
            LOGGER.info("Bad update");
            return null;
        }
    }

    public boolean existe(String sa, Integer id){
        if(userDao.findByUsername(sa,id).size()>0){
            return true;
        }else{
            return false;
        }
    }

    public User findByUserId (Integer id1){
        User user = userDao.findByUserId(id1);
        return user;
    }

}
