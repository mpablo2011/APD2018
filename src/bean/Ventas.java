package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ventas {
	private String idVenta;
	private Cliente cliente;
	private ArrayList<ItemVenta> itemsVenta;
	private Date fechaVenta;
	
	public Ventas () {
		itemsVenta = new ArrayList<ItemVenta>();
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
