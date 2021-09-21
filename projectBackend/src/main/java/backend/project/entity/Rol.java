package backend.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "rol")

public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rol_id;
    private String name_rol;
    private String rol_status;
    private int status;

    public Rol(){
        super();
    }

    public Rol(int rol_id, String name_rol, String rol_status, int status) {
        this.rol_id = rol_id;
        this.name_rol = name_rol;
        this.rol_status = rol_status;
        this.status = status;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
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
}
