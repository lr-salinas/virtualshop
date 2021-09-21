package backend.project.dto;

public class RolRequest {
    private String rol;
    private Integer status;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public RolRequest(){

    }
}
