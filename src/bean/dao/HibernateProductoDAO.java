package bean.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Productos;
import hbt.HibernateUtil;

public class HibernateProductoDAO {
	private static HibernateProductoDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateProductoDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateProductoDAO();
		} 
		return instancia;
	}
	
	public void grabarProducto(Productos prod) 
	{
		try
		{
			Session session = sf.openSession();
			session.beginTransaction();
			session.merge(prod);
			session.flush();
			session.getTransaction().commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	/*
	public List<Productos> getProductos() {
		Session session = sf.openSession();
		session.beginTransaction();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Productos> cq = cb.createQuery(Productos.class);
		Root<Productos> matRoot = cq.from(Productos.class);
		cq.select(matRoot).where(cb.equal());
		List<Materia> result = session.createQuery(cq).getResultList();
		session.getTransaction().commit();
		return result;
	}*/
	
	public Productos getProductoPorCodigo(int codigo) {
		Session session = sf.openSession();
		session.beginTransaction();
		Productos result = (Productos) session.get(Productos.class, codigo);
		session.getTransaction().commit();
		return result;
	}
}
