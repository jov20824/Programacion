package clases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Comanda {

	private String nombre;
	
	public Comanda(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String date = dateFormat.format(new Date());
		return date+" "+this.nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
}
