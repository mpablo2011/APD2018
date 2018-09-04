package bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
//@DiscriminatorValue("PT")
public class PaqueteTuristico extends Productos {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name="paquete_producto", joinColumns=@JoinColumn(name="paquete_id"), inverseJoinColumns=@JoinColumn(name="producto_id"))
	private Collection<Productos> productos;
	private String descripcion;
	private int descuento;
	
	public PaqueteTuristico()
	{
		
	}	
	
	public void agregarProducto() {
	
	}
	
	public void eliminarProducto() {
	
	}
	
	public void getPrecio() {
	
	}

	public Collection<Productos> getProductos() {
		return productos;
	}

	public void setProductos(Collection<Productos> productos) {
		this.productos = productos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
}
