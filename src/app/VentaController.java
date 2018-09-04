package app;

import bean.Cliente;
import bean.Ventas;
import bean.srv.ClienteSRV;

public class VentaController {
	
	private Ventas venta;

	public int VincularClienteAVenta(int dni) {
		
		ClienteSRV srv = new ClienteSRV();
		Cliente cli = srv.buscarCliente(dni);
		
		if(cli == null)
		{	
			return -1;
		}
		else
		{
			venta.setCliente(cli);
			return 1;
		}
		
	}

}
