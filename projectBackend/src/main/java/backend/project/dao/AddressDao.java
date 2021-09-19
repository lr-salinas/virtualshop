package backend.project.dao;

import backend.project.dto.AddressRequest;
import backend.project.model.Address;

import java.util.List;

public interface AddressDao {
    public List<Address>getAddress(Integer userId);
    public Address addressId(Integer addressId);
    public void newAddress(Address address);
    public void updateAddress(Address address);


}
