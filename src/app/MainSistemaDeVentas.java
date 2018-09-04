package app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import bean.Alojamientos;
import bean.Cliente;
import bean.PaqueteTuristico;
import bean.Pasajes;
import bean.Productos;
import bean.VisitasTuristicas;
import bean.Views.PaqueteView;
import bean.Views.ProductoView;
import bean.srv.ClienteSRV;
import bean.srv.ProductoSRV;

public class MainSistemaDeVentas {
	
	private List<Cliente> clientes;
	private List<Productos> productos;

	private static MainSistemaDeVentas instancia;

	public static MainSistemaDeVentas getInstancia() {
		if (instancia == null) {
			instancia = new MainSistemaDeVentas();
		}
		return instancia;
	}
	
	private MainSistemaDeVentas() {
		clientes = new ArrayList<Cliente>();
		productos = new ArrayList<Productos>();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public int altaCliente(int dni, String nombre, int telefono, String mail) {
		
		ClienteSRV srv = new ClienteSRV();
		Cliente aux = srv.buscarCliente(dni);
		
		if(aux == null)
		{
			Cliente cli = new Cliente();
			cli.setDni(dni);
			cli.setMail(mail);
			cli.setNombre(nombre);
			cli.setTelefono(telefono);
			
			srv.grabarCliente(cli);
			
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public ProductoView getProductoPorCodigo(int codigo) {
		Productos producto = new ProductoSRV().getProductoPorCodigo(codigo);
		return producto != null ? producto.getView() : null;		
	}

	public int bajaCliente(int dni) {

		ClienteSRV srv = new ClienteSRV();
		//Cliente cli = srv.getCliente(dni);
		Cliente cli = srv.buscarCliente(dni);
		
		if(cli == null)
		{	
			return -1;
		}
		else
		{
			srv.eliminarCliente(cli);
			return 1;
		}
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
	
	public void grabarPasaje(String descripcion, String fecha, String aerolinea, String origen, String destino, float precio)
	{
		try
		{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");	        
	         
			Productos producto = new Pasajes(descripcion,formatter.parse(fecha), aerolinea, origen, destino, precio);
			
			ProductoSRV srv = new ProductoSRV();
			
			srv.grabarProducto(producto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void grabarVisita(String descripcion, String fecha, String nombre,String ubicacion,float precio)
	{
		try
		{			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");	        
	         
			Productos producto = new VisitasTuristicas(descripcion,formatter.parse(fecha),nombre,ubicacion,precio);
			
			ProductoSRV srv = new ProductoSRV();
			
			srv.grabarProducto(producto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void grabarPaquete(PaqueteView paqueteVw) {
		
		List<Productos> lista = new ArrayList<Productos>();
		ProductoSRV srv = new ProductoSRV();
		
		for (ProductoView  prodVw: paqueteVw.getProductosView())
		{			 
			Productos prod = srv.getProductoPorCodigo(prodVw.getCodigoProducto());
			
			if (prod != null)
				lista.add(prod);
		}
		
		srv.grabarProducto(new PaqueteTuristico(paqueteVw.getDescripcion(),paqueteVw.getDescuento(),lista));
	}
				
}
