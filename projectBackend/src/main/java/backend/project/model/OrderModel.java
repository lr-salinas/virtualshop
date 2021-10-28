package backend.project.model;

public class OrderModel {

    private int order_id;
    private int product_id;
    private int user_id;
    private int order_status_status_id;
    private int cantidad;

    public OrderModel(int order_id, int product_id, int user_id, int order_status_status_id, int cantidad) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.user_id = user_id;
        this.order_status_status_id = order_status_status_id;
        this.cantidad = cantidad;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getOrder_status_status_id() {
        return order_status_status_id;
    }

    public void setOrder_status_status_id(int order_status_status_id) {
        this.order_status_status_id = order_status_status_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public OrderModel() {
        super();
        // TODO Auto-generated constructor stub
    }
}
