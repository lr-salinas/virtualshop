package backend.project.bl;

import backend.project.dao.AddressDao;
import backend.project.dao.TransactionDao;
import backend.project.dto.AddressRequest;
import backend.project.model.Address;
import backend.project.model.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBl {
    private AddressDao addressDao;
    private TransactionDao transactionDao;
    private static final Logger LOGGER =  LoggerFactory.getLogger(AddressBl.class);

  /*  @Autowired
    public AddressBl(AddressDao addressDao, TransactionDao transactionDao){
        this.addressDao = addressDao;
        this.transactionDao = transactionDao;
    }

    public Address getAddressDetails(Integer userid, Integer addressid){
        return addressDao.addressId(addressid);
    }

    public List<Address> getAddress(Integer userId){
        return addressDao.getAddress(userId);
    }

    public AddressRequest createAddress(Integer userId, AddressRequest addressRequest, Transaction transaction){

          Address address = new Address();
                address.setAddressId(userId);
                address.setAddress(addressRequest.getAddress());
                address.setNumberHouse(addressRequest.getNumberHouse());
                address.setReference(addressRequest.getReference());
                address.setStatus(1);
                address.setTransaction(transaction);

                addressDao.newAddress(address);
                return addressRequest;
    }

    public AddressRequest updateAddress(AddressRequest addressRequest, Integer addressId, Integer userid, Transaction transaction){
        Address address = new Address();
        address.setAddressId(addressId);
        address.setAddress(addressRequest.getAddress());
        address.setNumberHouse(addressRequest.getNumberHouse());
        address.setReference(addressRequest.getReference());
        address.setStatus(1);
        address.setTransaction(transaction);

        addressDao.updateAddress(address);
        return addressRequest;
        }
*/
}
