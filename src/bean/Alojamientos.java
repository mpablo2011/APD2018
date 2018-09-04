package bean;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AL")
public class Alojamientos extends Productos {
<<<<<<< HEAD
	private Date fechaDesde;
	private String nombreAlojamiento;
	private Date FechaHasta;
	private float precio;
	private String ubicacion;
	
	public Alojamientos(String descripcion,Date fechaDesde, Date fechaHasta, String nombreAlojamiento, float precio, String ubicacion)
	{
		this.fechaDesde = fechaDesde;
		this.FechaHasta = fechaHasta;
		this.nombreAlojamiento = nombreAlojamiento;
		this.precio = precio; 
		this.ubicacion = ubicacion;
		this.descripcion = descripcion;
	}
	
	
=======
	//public Date fechaDesde;
	public String nombreAlojamiento;
	//public Date FechaHasta;
	public Float precio;
	public String ubicacion;
>>>>>>> a69402856765201d3872a3579d997e4c7ada211f
}
