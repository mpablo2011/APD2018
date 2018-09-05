package bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ItemVenta implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idItem;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name= "codigoProducto")
	private Productos producto;
	
	private int cantidad;
	
	public Productos getProducto() {
		return producto;
	}
	
	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
