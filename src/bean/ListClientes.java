package bean;

import java.util.ArrayList;
import java.util.List;

import bean.dao.HibernateClienteDAO;



public class ListClientes 
{
	private List<Cliente> clientes;
	
	public ListClientes()
	{
		clientes= new ArrayList<Cliente>();
		}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void addCliente(Cliente cliente){
		HibernateClienteDAO hcd = new HibernateClienteDAO();
		hcd.grabarCliente(cliente);
		clientes.add(cliente);
	}
	
	public boolean removeCliente(Cliente cliente) {
		return clientes.remove(cliente);
	}
	
	public Cliente getClientePorDNI(int dni){
		for(Cliente u : clientes){
			if(u.getDni() == dni)
				return u;
		}
		return null;
	}
	
	public boolean existeCliente(int dni){
		for(Cliente u : clientes){
			if(u.getDni() == dni)
				return true;
		}
		return false;
	}
	
	
	
	
	public int size(){
		return clientes.size();
	}

	public void actualizarBD() 
	{
		
	}
}
