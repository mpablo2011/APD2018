package bean;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AL")
public class Alojamientos extends Productos {
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
}
