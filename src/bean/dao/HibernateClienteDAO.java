package bean.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import hbt.HibernateUtil;

public class HibernateClienteDAO {
	private static HibernateClienteDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateClienteDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateClienteDAO();
		} 
		return instancia;
	}
	
	public void grabarCliente(Cliente cli) 
	{
		Session session = sf.openSession();
		session.beginTransaction();
		session.merge(cli);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}
	
	public Cliente getCliente(int dni){
		
		String consulta = "from cliente where dni = :dni";
		Session session = sf.openSession();
		Query query = session.createQuery(consulta);
		query.setParameter("dni", dni);
		List<Cliente> list = query.list();
		session.close();
		return list.get(1);
	}

}
