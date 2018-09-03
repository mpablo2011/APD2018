package bean;

import java.sql.Date;
import java.util.Collection;

public class Ventas {
	public String idVenta;
	public Cliente cliente;
	public Collection<ItemVenta> itemVenta;
	public Date fechaVenta;
	public void getPrecioTotal() {
	
	}
}
