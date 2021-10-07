package backend.project.model;

public class CategoriaModel {
	private int categoria_id;
	private String nombre;
	private boolean status;
	
	public CategoriaModel(int categoria_id, String nombre, boolean status) {
		super();
		this.categoria_id = categoria_id;
		this.nombre = nombre;
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CategoriaModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}


