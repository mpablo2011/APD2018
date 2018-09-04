package app;

import java.text.SimpleDateFormat;
import java.util.Collection;

import bean.Alojamientos;
import bean.Cliente;
import bean.ListClientes;
import bean.ListProductos;
import bean.Productos;
import bean.Views.ProductoView;
import srv.ProductoSRV;

public class MainSistemaDeVentas {
	
	private ListClientes clientes;
	private ListProductos productos;

	private static MainSistemaDeVentas instancia;

	public static MainSistemaDeVentas getInstancia() {
		if (instancia == null) {
			instancia = new MainSistemaDeVentas();
		}
		return instancia;
	}
	
	private MainSistemaDeVentas() {
		clientes = new ListClientes();
		productos = new ListProductos();
	}

	public ListClientes getClientes() {
		return clientes;
	}

	public void addCliente(Cliente cliente) {
		clientes.addCliente(cliente);
	}
	
	public int altaCliente(int dni, String nombre, int telefono, String mail) {
		
		if(!clientes.existeCliente(dni))
		{
			Cliente cli = new Cliente();
			cli.setDni(dni);
			cli.setMail(mail);
			cli.setNombre(nombre);
			cli.setTelefono(telefono);
			
			clientes.addCliente(cli);
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public ProductoView getProducto(int id) {
		Productos producto = new ProductoSRV().getProductoPorId(id);
		return producto.getView();		
	}

	public int bajaCliente(int dni) {

		Cliente cli = clientes.getClientePorDNI(dni);
		
		if(cli.equals(null))
		{	
			return -1;
		}
		else
		{
			clientes.removeCliente(cli);
			return 1;
		}
	}
	
	public boolean existeProducto(int id)
	{
		return true;
	}
	
	public void agregarProducto(int id)
	{
		
	}
	
	public void grabarAlojamiento(String descripcion, String fechaDesde,String fechaHasta, String nombre, float precio, String ubicacion)
	{
		try
		{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");	        
			 	          
			Productos producto = new Alojamientos(descripcion,formatter.parse(fechaDesde),formatter.parse(fechaHasta),nombre,precio,ubicacion);
			
			ProductoSRV srv = new ProductoSRV();
			
			srv.grabarProducto(producto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
				
}
