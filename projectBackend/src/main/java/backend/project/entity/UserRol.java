package backend.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_rol")
public class UserRol {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_rol_id;
    private int user_id;
    private int rol_id;

    public UserRol(){
        super();
    }

    public UserRol(int user_rol_id, int user_id, int rol_id) {
        super();
        this.user_rol_id = user_rol_id;
        this.user_id = user_id;
        this.rol_id = rol_id;
    }

    public int getUser_rol_id() {
        return user_rol_id;
    }

    public void setUser_rol_id(int user_rol_id) {
        this.user_rol_id = user_rol_id;
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
}
