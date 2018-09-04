package app;

import bean.Cliente;
import bean.ItemVenta;
import bean.Productos;
import bean.Ventas;
import bean.Views.ProductoView;
import bean.Views.VentaView;
import bean.srv.ClienteSRV;
import bean.srv.ProductoSRV;

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
	
	public void agregarProducto(int codproducto, int cant) {
		
		Productos producto = new ProductoSRV().getProductoPorCodigo(codproducto);
		ItemVenta iv = new ItemVenta();
		
		iv.setCantidad(cant);
		iv.setProducto(producto);
		
		venta.setItemVenta(iv);
		
	}
	
	public VentaView getVentaView()
	{
		VentaView vv = new VentaView();
		
		vv.setTotalVenta(this.venta.getPrecioTotal());
		
		return vv;
	}

}
