package bean;

import bean.Views.ProductoView;

public class Productos {
	public int codigoProducto;
	public String descripcion;
	
	public void getPrecio() {
	
	}
	
	public void getProducto(int codigoProducto) {
	
	}
	
	public ProductoView getView()
	{
		return new ProductoView(codigoProducto,descripcion);
	}
}
