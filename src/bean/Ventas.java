package bean;

import java.sql.Date;
import java.util.Collection;

public class Ventas {
	public String idVenta;
	public Cliente cliente;
	public ListItemVenta itemsVenta;
	//public Date fechaVenta;
	public void getPrecioTotal() {
	
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
	public ListItemVenta getItemVenta() {
		return itemsVenta;
	}
	public void setItemVenta(ItemVenta itemVenta) {
		itemsVenta.addItemVenta(itemVenta);
	}
}
