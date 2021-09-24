package backend.project.model;

public class ProductoModel {
	private int product_id;
	private String product_name;
	private String details;
	private String size;
	private int stock;
	private int color;
	private int quantity;
	private double costProduct;
	private Integer status;
	
	
	public ProductoModel(int product_id, String product_name, String details, String size, int stock, int color, int quantity,
			double costProduct, int status) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.details = details;
		this.size = size;
		this.stock=stock;
		this.color = color;
		this.quantity=quantity;
		this.costProduct = costProduct;
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


	public ProductoModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}


