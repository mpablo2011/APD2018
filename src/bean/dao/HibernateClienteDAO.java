package bean.dao;

import java.util.List;

import org.hibernate.Hibernate;
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
		
		
		Session session = sf.openSession();
		String hql = "from clientes where dni = :dni";
		@SuppressWarnings("unchecked")
		List<Cliente> list = session.createQuery(hql)
		.setParameter("dni", dni)
		.list();
		session.close();
		return list.get(0);

	}
	
	public Cliente buscarCliente(int dni) throws Exception
	{
		Session session = null;
		Cliente cliente = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			cliente = session.load(Cliente.class, dni);
			Hibernate.initialize(cliente);
		} catch (Exception e) {
			return null;
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return cliente;
	}
	
	public int eliminarCliente(Cliente cli) {
	
		Session session = sf.openSession();
		session.beginTransaction();
		session.remove(cli);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return 1;
	}

}
