package bean;

import java.util.ArrayList;
import java.util.List;

public class ListProductos {
private List<Productos> productos;
	
	public ListProductos()
	{
		productos= new ArrayList<Productos>();
	}

	public List<Productos> getProductos() {
		return productos;
	}
	
	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	
	public void addProducto(Productos producto){
		productos.add(producto);
	}
	
	public boolean removeProducto(Productos producto) {
		return productos.remove(producto);
	}
	
	public Productos getProductoPorID(int id){
		for(Productos p : productos){
			if(p.getCodigoProducto() == id)
				return p;
		}
		return null;
	}
	
	public boolean existeProducto(int id){
		for(Productos p : productos){
			if(p.getCodigoProducto() == id)
				return true;
		}
		return false;
	}
	
	public int size(){
		return productos.size();
	}

	public void actualizarBD() 
	{
		
	}
}
