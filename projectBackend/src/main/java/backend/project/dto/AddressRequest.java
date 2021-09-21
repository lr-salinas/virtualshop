package backend.project.dto;

public class AddressRequest {
    private String address;
    private String numberHouse;
    private String reference;
    private Integer status;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AddressRequest{" +
                "address='" + address + '\'' +
                ", numberHouse='" + numberHouse + '\'' +
                ", reference='" + reference + '\'' +
                ", status=" + status +
                '}';
    }
}
