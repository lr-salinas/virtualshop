package backend.project.model;

public class UserModel {
    private int user_id;
    private String name;
    private String lastname;
    private String email;
    private String cellphone;
    private String telephone;
    private String username;
    private String password;
    private String rol;
    private int status;

    public UserModel(int user_id, String name, String lastname, String email, String cellphone, String telephone, String username, String password, String rol, int status) {
       super();
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.cellphone = cellphone;
        this.telephone = telephone;
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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
