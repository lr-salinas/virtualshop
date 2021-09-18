package backend.project.api;

import backend.project.bl.TransactionBl;
import backend.project.bl.UserBl;
import backend.project.dto.UserRequest;
import backend.project.dto.UserUpdate;
import backend.project.model.Transaction;
import backend.project.model.User;
import backend.project.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserApi {

    private UserBl userBl;
    private TransactionBl transactionBl;

    @Autowired
    public UserApi(UserBl userBl, TransactionBl transactionBl){
        this.userBl = userBl;
        this.transactionBl = transactionBl;
    }

    @RequestMapping(value = "/{userid}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public User updateuser(@PathVariable("userid") Integer id, @Valid @RequestBody UserUpdate userUpdate, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        User userResponse = userBl.updateUser(userUpdate, id, transaction);

        return userResponse;
    }

    @RequestMapping(value = "/{userid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User findbyuserid(@PathVariable("userid") Integer id){

        return userBl.findByUserId(id);
    }
}
