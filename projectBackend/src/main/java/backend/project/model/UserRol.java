package backend.project.model;

public class UserRol {
    private Integer userRolId;
    private Integer userId;
    private Integer rolId;

    public UserRol(){
    }

    public Integer getUserRolId() {
        return userRolId;
    }

    public void setUserRolId(Integer userRolId) {
        this.userRolId = userRolId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }
}
