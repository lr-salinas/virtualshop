package backend.project.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "product")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int product_id;
	private String product_name;
	private String details;
	private String size;
	private int stock;
	private int color;
	private int quantity;
	//	private boolean available;
	private double costProduct;
	//	private String image;
	private boolean status;
	private int categoria_categoria_id;
	private String image;

	public Producto () {
		super();
	}

	public Producto(int product_id, String product_name, String details, String size, int stock, int color, int quantity, double costProduct, boolean status, int categoria_categoria_id, String image) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.details = details;
		this.size = size;
		this.stock = stock;
		this.color = color;
		this.quantity = quantity;
//		this.available = available;
		this.costProduct = costProduct;
//		this.image = image;
		this.status = status;
		this.categoria_categoria_id = categoria_categoria_id;
		this.image = image;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	public boolean isAvailable() {
//		return available;
//	}
//
//	public void setAvailable(boolean available) {
//		this.available = available;
//	}

	public int getCategoria_categoria_id() {
		return categoria_categoria_id;
	}

	public void setCategoria_categoria_id(int categoria_categoria_id) {
		this.categoria_categoria_id = categoria_categoria_id;
	}

	public double getCostProduct() {
		return costProduct;
	}

	public void setCostProduct(double costProduct) {
		this.costProduct = costProduct;
	}

//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Producto [product_id=" + product_id + ", product_name=" + product_name + ", details=" + details
				+ ", size=" + size + ", stock=" + stock + ", color=" + color + ", quantity=" + quantity
				+ ", costProduct=" + costProduct + ", status=" + status + ", categoria_categoria_id="
				+ categoria_categoria_id + "]";
	}
}
