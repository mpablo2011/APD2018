package bean;

import java.util.Date;

public class VisitasTuristicas extends Productos {
	private Date fecha;
	private String nombreGuia;
	private String ubicacion;
	private Float precio;
	
	public  VisitasTuristicas()
	{
		
	}
	
	@Override
	public void getPrecio() {
		// TODO Auto-generated method stub
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreGuia() {
		return nombreGuia;
	}

	public void setNombreGuia(String nombreGuia) {
		this.nombreGuia = nombreGuia;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
