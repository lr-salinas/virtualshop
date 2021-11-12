package backend.project.model;

public class CartModel {
    private int cart_id;
    private int user_id;
    private int product_id;
    private double costo_total;

    public CartModel(int cart_id, int user_id, int product_id, double costo_total) {
        this.cart_id = cart_id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.costo_total = costo_total;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    public CartModel(){
        super();
    }
}
