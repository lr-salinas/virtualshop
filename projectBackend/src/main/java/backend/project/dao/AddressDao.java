package backend.project.dao;

import backend.project.dto.AddressRequest;
import backend.project.model.Address;

import java.util.List;

public interface AddressDao {
    public void createAddress(Address address);
    public void updateAddress(Address address);


}
