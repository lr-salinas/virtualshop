package backend.project.api;

import backend.project.bl.AddressBl;
import backend.project.bl.TransactionBl;
import backend.project.dto.AddressRequest;
import backend.project.model.Address;
import backend.project.model.Transaction;
import backend.project.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping(value = "/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AddressApi {

    private AddressBl addressBl;
    private TransactionBl transactionBl;

  /*  @Autowired
    public AddressApi(AddressBl addressBl, TransactionBl transactionBl){
        this.addressBl = addressBl;
        this.transactionBl = transactionBl;
    }

    @RequestMapping(value = "/{userid}/address", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Address> getUserAddress(@PathVariable("userid") Integer userid, HttpServletRequest request){
        return addressBl.getAddress(userid);
    }

    @RequestMapping(value = "/{userid}/address/{addressid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Address getAddressDetails(@PathVariable("userid") Integer userid, @PathVariable("addressid") Integer addressid, HttpServletRequest request){
        return addressBl.getAddressDetails(userid,addressid);
    }

    @RequestMapping(value ="/{userid}/address", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public AddressRequest createAddress(@PathVariable("userid") Integer userid, @RequestBody AddressRequest addressRequest,HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);

        AddressRequest addressResponse = addressBl.createAddress(addressRequest, transaction);
        return addressResponse;
    }

    public AddressRequest updateAddress(@PathVariable("userid") Integer userid, @PathVariable("cardid") Integer addressId,@RequestBody AddressRequest addressRequest, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);

        AddressRequest addressResponse = addressBl.updateAddress(addressRequest, addressId, userid, transaction);
        return addressResponse;
    }

*/

}
