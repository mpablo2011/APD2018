package app;

import java.util.Collection;

import bean.Cliente;

public class MainSistemaDeVentas {
	
	private Collection<Cliente> clientes;

	private static MainSistemaDeVentas instancia;

	public static MainSistemaDeVentas getInstancia() {
		if (instancia == null) {
			instancia = new MainSistemaDeVentas();
		}
		return instancia;
	}

	public Collection<Cliente> getClientes() {
		return clientes;
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public int altaCliente(int dni, String nombre, int telefono, String mail) {
		
		Cliente cli = new Cliente();
		cli.setDni(dni);
		cli.setMail(mail);
		cli.setNombre(nombre);
		cli.setTelefono(telefono);
		
		clientes.add(cli);
		
		return 1;
	}

}
