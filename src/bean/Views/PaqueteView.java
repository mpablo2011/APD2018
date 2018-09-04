package bean.Views;

import java.util.Collection;

public class PaqueteView {
	private Collection<ProductoView> productos;
	private String descripcion;
	private int descuento;
	
	
	public void agregarProducto(ProductoView producto) {
		productos.add(producto);
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
}
