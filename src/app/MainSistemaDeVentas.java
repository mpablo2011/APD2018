package app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	
	public void cargaInicial()
	{
		//Clientes
		this.altaCliente(31000001, "Cliente1", 4445555, "mail@cliente1.com");
		this.altaCliente(31000002, "Cliente2", 4445556, "mail@cliente2.com");
		this.altaCliente(31000003, "Cliente3", 4445557, "mail@cliente3.com");
		this.altaCliente(31000004, "Cliente4", 4445558, "mail@cliente4.com");
		this.altaCliente(31000005, "Cliente5", 4445559, "mail@cliente5.com");
		
		//Alojamientos
		this.grabarAlojamiento("Buen Hotel1", "01/01/2018", "01/02/2018", "Alojamiento1", 100, "Ubicacion1");
		this.grabarAlojamiento("Buen Hotel2", "01/01/2018", "01/02/2018", "Alojamiento2", 200, "Ubicacion2");
		this.grabarAlojamiento("Buen Hotel3","01/01/2018", "01/02/2018", "Alojamiento3", 300, "Ubicacion3");
		this.grabarAlojamiento("Buen Hotel4", "01/01/2018", "01/02/2018", "Alojamiento4", 400, "Ubicacion4");
		this.grabarAlojamiento("Buen Hotel5", "01/01/2018", "01/02/2018", "Alojamiento5", 500, "Ubicacion5");
		
		//Pasaje
		this.grabarPasaje("Pasaje1", "01/01/2018", "Aerolinea1", "Origen1", "Destino1", 100);
		this.grabarPasaje("Pasaje2", "01/01/2018", "Aerolinea2", "Origen2", "Destino2", 200);
		this.grabarPasaje("Pasaje3", "01/01/2018", "Aerolinea3", "Origen3", "Destino3", 300);
		this.grabarPasaje("Pasaje4", "01/01/2018", "Aerolinea4", "Origen4", "Destino4", 400);
		this.grabarPasaje("Pasaje5", "01/01/2018", "Aerolinea5", "Origen5", "Destino5", 500);
		
		//Visita
		this.grabarVisita("Desc Visita1", "01/01/2018", "Visita1", "ubicacion1", 100);
		this.grabarVisita("Desc Visita2", "01/01/2018", "Visita2", "ubicacion2", 200);
		this.grabarVisita("Desc Visita3", "01/01/2018", "Visita3", "ubicacion3", 300);
		this.grabarVisita("Desc Visita4", "01/01/2018", "Visita4", "ubicacion4", 400);
		this.grabarVisita("Desc Visita5", "01/01/2018", "Visita5", "ubicacion5", 500);
		
		//Paquetes
		PaqueteView paq = null;
		ProductoView prod = null;
		
		paq = new PaqueteView();
		paq.setDescripcion("Paquete1");paq.setDescuento(10);
		prod = new ProductoView(1, "Prod1"); paq.getProductosView().add(prod);
		prod = new ProductoView(6, "Prod2");paq.getProductosView().add(prod);
		this.grabarPaquete(paq);
		
		paq = new PaqueteView();
		paq.setDescripcion("Paquete2");paq.setDescuento(20);
		prod = new ProductoView(2, "Prod1"); paq.getProductosView().add(prod);
		prod = new ProductoView(7, "Prod2");paq.getProductosView().add(prod);
		this.grabarPaquete(paq);

		paq = new PaqueteView();
		paq.setDescripcion("Paquete3");paq.setDescuento(30);
		prod = new ProductoView(3, "Prod1"); paq.getProductosView().add(prod);
		prod = new ProductoView(8, "Prod2");paq.getProductosView().add(prod);
		this.grabarPaquete(paq);
		
		paq = new PaqueteView();
		paq.setDescripcion("Paquete4");paq.setDescuento(40);
		prod = new ProductoView(4, "Prod1"); paq.getProductosView().add(prod);
		prod = new ProductoView(8, "Prod2");paq.getProductosView().add(prod);
		this.grabarPaquete(paq);
		
		paq = new PaqueteView();
		paq.setDescripcion("Paquete5");paq.setDescuento(50);
		prod = new ProductoView(5, "Prod1"); paq.getProductosView().add(prod);
		prod = new ProductoView(9, "Prod2");paq.getProductosView().add(prod);
		this.grabarPaquete(paq);				
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
		
		if (producto != null)
		{
			ProductoView prodView = producto.getView();
			String clase = producto.getClass().getSimpleName();
			
			if(clase.equals("PaqueteTuristico"))
				prodView.setEsPaquete(true);
			else
				prodView.setEsPaquete(false);
			
			return prodView;
		}
		
		return null;		
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
