package backend.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")

    private int order_id;
    private int product_id;
    private int user_id;
    private int order_status_status_id;
    private int cantidad;



    public Order () {
        super();
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
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

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", product_id=" + product_id +
                ", user_id=" + user_id +
                ", order_status_status_id=" + order_status_status_id +
                ", cantidad=" + cantidad +
                '}';
    }
}
