package backend.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "product_cart")
public class ProductCart {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_cart_id;
    private int product_id;
    private int cart_id;

    public ProductCart(){
        super();
    }

    public ProductCart(int product_cart_id, int product_id, int cart_id){
        super();
        this.product_cart_id = product_cart_id;
        this.product_id = product_id;
        this.cart_id = cart_id;
    }

    public int getProduct_cart_id() {
        return product_cart_id;
    }

    public void setProduct_cart_id(int product_cart_id) {
        this.product_cart_id = product_cart_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }
}
