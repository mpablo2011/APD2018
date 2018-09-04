package srv;
import bean.Productos;
import bean.dao.HibernateProductoDAO;


public class ProductoSRV {
	
	
	private static HibernateProductoDAO dao;
	static {
		dao = HibernateProductoDAO.getInstancia();
	}
	
	
	public Productos getProductoPorId(int id) {
		return null;
	}
	
	public void grabarProducto(Productos producto) {
		dao.grabarProducto(producto);
	}

	

}
