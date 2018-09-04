package bean;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PJ")
public class Pasajes extends Productos {
	public Date fechaPasaje;
	public float precio;
	public String aerolinea;
	public String origen;
	public String destino;
}
