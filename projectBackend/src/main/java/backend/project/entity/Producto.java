package backend.project.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String product_name;
	private String details;
	private String size;
	private int color;
	private double costProduct;
	private int status;
	
	public Producto () {
		super();
	}
	
	public Producto(int product_id, String product_name, String details, String size, int color, double costProduct, int status) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.details = details;
		this.size = size;
		this.color = color;
		this.costProduct= costProduct;
		this.status = status;
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

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public double getCostProduct() {
		return costProduct;
	}

	public void setCostProduct(double costProduct) {
		this.costProduct = costProduct;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
