package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Ventas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "id")
	private String idVenta;
	
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name= "dni")
	private Cliente cliente;
	
	@OneToMany(cascade= CascadeType.ALL, fetch=FetchType.EAGER, orphanRemoval= true)
	@NotFound(action= NotFoundAction.IGNORE)
	@JoinColumn(name="idVenta", nullable= false)
	private List<ItemVenta> itemsVenta;
	private Date fechaVenta;
	
	public Ventas()
	{
		
	}
		
	public float getPrecioTotal() 
	{
		float total = 0;
		
		for(ItemVenta i : this.itemsVenta)
			total = total + (i.getProducto().getPrecio() * i.getCantidad());

		return total;
	}
	
	public String getIdVenta() {
		return idVenta;
	}
	
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<ItemVenta> getItemVenta() {
		return itemsVenta;
	}
	public void setItemVenta(ItemVenta itemVenta) {
		this.itemsVenta.add(itemVenta);
	}
	
	public Date getFechaVenta() {
		return fechaVenta;
	}
	
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
}
