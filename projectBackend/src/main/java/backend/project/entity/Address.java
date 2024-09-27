package backend.project.entity;

import javax.persistence.*;

@Entity
@Table(name="address")

public class Address {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;
    private String address;
    private String number_house;
    private String reference;
    private String status;

    public Address(){
        super();
    }

    public Address(int address_id, String address, String number_house, String reference, String status) {
        super();
        this.address_id = address_id;
        this.address = address;
        this.number_house = number_house;
        this.reference = reference;
        this.status = status;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber_house() {
        return number_house;
    }

    public void setNumber_house(String number_house) {
        this.number_house = number_house;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
