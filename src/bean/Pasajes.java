package bean;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("PJ")
public class Pasajes extends Productos {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fechaPasaje;
	@SuppressWarnings("unused")
	private float precio;
	private String aerolinea;
	private String origen;
	private String destino;
	
	public Pasajes()
	{
		
	}
	
	@Override
	public void getPrecio() {
		// TODO Auto-generated method stub
		
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Date getFechaPasaje() {
		return fechaPasaje;
	}

	public void setFechaPasaje(Date fechaPasaje) {
		this.fechaPasaje = fechaPasaje;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
}
