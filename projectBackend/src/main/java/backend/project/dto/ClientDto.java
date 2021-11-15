package backend.project.dto;
public class ClientDto {


    private int user_id;
    private int rol_id;
    private String username;
    private String name_rol;
    private String email;
    private String name;
    private String lasname;



    public ClientDto(int user_id, int rol_id, String username, String name_rol, String email, String name, String lasname) {
        this.user_id = user_id;
        this.rol_id = rol_id;
        this.username = username;
        this.name_rol = name_rol;
        this.email = email;
        this.name = name;
        this.lasname = lasname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName_rol() {
        return name_rol;
    }

    public void setName_rol(String name_rol) {
        this.name_rol = name_rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "user_id=" + user_id +
                ", rol_id=" + rol_id +
                ", username='" + username + '\'' +
                ", name_rol='" + name_rol + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lasname='" + lasname + '\'' +
                '}';
    }
}
