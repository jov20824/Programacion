package planeta;

import errores.PlanetaImposibleException;

public class Planeta {

	private String nombre;
	private double distancia;
	private double masa;

	public Planeta(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) throws PlanetaImposibleException {
		if (distancia>10) {
			this.distancia = distancia;
		}
		else {
			String texto = "No puede haber un planeta con dichas características";
			PlanetaImposibleException error = new PlanetaImposibleException(texto);
			throw error;
		}
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) throws PlanetaImposibleException {
		if (masa>10) {
			this.masa = masa;
		}
		else {
			String texto = "No puede haber un planeta con dichas características";
			PlanetaImposibleException error = new PlanetaImposibleException(texto);
			throw error;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Planeta [" + nombre + ", " + distancia + ", " + masa + "]";
	}

}
