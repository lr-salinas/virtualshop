package backend.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(columnDefinition = "serial")
    private int cart_id;
    private  int product_id;

    public Cart(){
        super();
    }

    public Cart(int cart_id, int product_id) {
        super();
        this.cart_id = cart_id;
        this.product_id = product_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", product_id=" + product_id +
                '}';
    }
}
