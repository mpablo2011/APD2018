package bean.Views;

public class ProductoView {
	private int codigoProducto;
	private String descripcion;
	
	public ProductoView(int codigo, String descripcion) {
		this.setCodigoProducto(codigo);
		this.setDescripcion(descripcion);
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
}

