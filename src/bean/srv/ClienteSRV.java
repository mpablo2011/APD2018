package bean.srv;

import bean.Cliente;
import bean.dao.HibernateClienteDAO;


public class ClienteSRV {
	private static HibernateClienteDAO dao;
	
	static {
		dao = HibernateClienteDAO.getInstancia();
	}
	
	public void grabarCliente(Cliente cli){
		dao.grabarCliente(cli);
	}
	
	public Cliente getCliente(int cli){
		return dao.getCliente(cli);
	}
	
}
