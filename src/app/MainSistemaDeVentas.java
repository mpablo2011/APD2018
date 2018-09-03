package app;

import java.util.Collection;

import bean.Cliente;
import bean.ListClientes;

public class MainSistemaDeVentas {
	
	private ListClientes clientes;

	private static MainSistemaDeVentas instancia;

	public static MainSistemaDeVentas getInstancia() {
		if (instancia == null) {
			instancia = new MainSistemaDeVentas();
		}
		return instancia;
	}
	
	private MainSistemaDeVentas() {
		clientes = new ListClientes();
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

}
