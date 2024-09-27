package backend.project.model;

public class ProductoImagenModel {
	private int imagen_id;
	private int product_product_id;
	
	
	public ProductoImagenModel(int imagen_id, int product_product_id) {
		
		
		super();
		this.imagen_id = imagen_id;
		this.product_product_id = product_product_id;
	}
	public int getImagen_id() {
		return imagen_id;
	}
	public void setImagen_id(int imagen_id) {
		this.imagen_id = imagen_id;
	}
	public int getProduct_product_id() {
		return product_product_id;
	}
	public void setProduct_product_id(int product_product_id) {
		this.product_product_id = product_product_id;
	}
	
	

}
