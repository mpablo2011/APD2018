package hbt;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import bean.Cliente;

 
public class HibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
        	
        	Configuration config = new Configuration();
            config.addAnnotatedClass(Cliente.class);
            sessionFactory = config.buildSessionFactory();
                         
        	
            
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
