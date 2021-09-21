package backend.project.model;

public class Rol {
    private Integer rolId;
    private String name;
    private Integer rolStatus;
    private Integer status;
    private Transaction transaction;

    public Rol(){
        transaction = new Transaction();
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRolStatus() {
        return rolStatus;
    }

    public void setRolStatus(Integer rolStatus) {
        this.rolStatus = rolStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "rolId=" + rolId +
                ", name='" + name + '\'' +
                ", rolStatus=" + rolStatus +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
