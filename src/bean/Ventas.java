package bean;

import java.sql.Date;
import java.util.Collection;

public class Ventas {
	public String idVenta;
	public Cliente cliente;
	public Collection<ItemVenta> itemVenta;
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
	public Collection<ItemVenta> getItemVenta() {
		return itemVenta;
	}
	public void setItemVenta(Collection<ItemVenta> itemVenta) {
		this.itemVenta = itemVenta;
	}
}
