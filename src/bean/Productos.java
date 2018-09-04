package bean;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import bean.Views.ProductoView;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigoProducto;
	
	@Column (name = "descripcion", length = 100)
	protected String descripcion;
	
	public abstract void getPrecio();
		
	public int getCodigoProducto() {
		return this.codigoProducto;
	}
	
	public ProductoView getView()
	{
		return new ProductoView(codigoProducto,descripcion);
	}
}
