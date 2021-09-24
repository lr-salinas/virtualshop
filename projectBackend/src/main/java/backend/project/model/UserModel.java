package backend.project.model;

public class UserModel {
    private int user_id;
    private int address_id;
    private int rol_id;
    private String name;
    private String lastname;
    private String email;
    private String cellphone;
    private String telephone;
    private String username;
    private String password;
    //address
    private String address;
    private String number_house;
    private String reference;
    //rol
    private String name_rol;
    private String rol_status;
    private int status;

    public UserModel(int user_id, int address_id, int rol_id, String name, String lastname, String email, String cellphone, String telephone, String username, String password, String address, String number_house, String reference, String name_rol, String rol_status, int status) {
        super();
        this.user_id = user_id;
        this.address_id = address_id;
        this.rol_id = rol_id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.cellphone = cellphone;
        this.telephone = telephone;
        this.username = username;
        this.password = password;
        this.address = address;
        this.number_house = number_house;
        this.reference = reference;
        this.name_rol = name_rol;
        this.rol_status = rol_status;
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAddress_id() {return address_id;}

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getName_rol() {
        return name_rol;
    }

    public void setName_rol(String name_rol) {
        this.name_rol = name_rol;
    }

    public String getRol_status() {
        return rol_status;
    }

    public void setRol_status(String rol_status) {
        this.rol_status = rol_status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public UserModel(){
        super();
    }
}
