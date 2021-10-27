package backend.project.model;

public class RolModel {

    private int rol_id;
    private String nombre;
    private int status;

    public RolModel(int rol_id, String nombre, int status) {
        this.rol_id = rol_id;
        this.nombre = nombre;
        this.status = status;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public RolModel() {

        super();
        // TODO Auto-generated constructor stub
    }


}
