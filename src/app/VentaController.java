package app;

import bean.Cliente;
import bean.Ventas;
import bean.srv.ClienteSRV;

public class VentaController {
	
	private Ventas venta;
	private static VentaController instancia;

	public static VentaController getInstancia() {
		if (instancia == null) {
			instancia = new VentaController();
		}
		return instancia;
	}
	
	private VentaController() {
		venta = new Ventas();
	}

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
