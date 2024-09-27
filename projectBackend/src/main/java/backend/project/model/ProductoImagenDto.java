
package backend.project.model;

import org.springframework.beans.factory.annotation.Autowired;

import backend.project.dao.ProductoImagenDao;
import backend.project.entity.Producto;

public class ProductoImagenDto {
	private int imagen_id;
	private int product_product_id;
 
	@Autowired
	private ProductoImagenDao productoimagenDao;	

	
	public ProductoImagenDto(int imagen_id, int product_product_id) {
		
	
		
		super();
		this.imagen_id = imagen_id;
		this.product_product_id = product_product_id;
	}
	public ProductoImagenDto() {
		super();
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
	
	public void Producto (Producto producto) {
		for (int i=0;i<producto.getImagenId().length;i++){
		ProductoImagenDto prodima=new ProductoImagenDto(producto.getProduct_id(), producto.getImagenId()[i]) ;
		productoimagenDao.guardar(prodima);
		}

		
		
	}

}
