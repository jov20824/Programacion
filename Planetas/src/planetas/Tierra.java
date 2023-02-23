package planetas;

public class Tierra extends Planeta {

	private int poblacion;
	
	public Tierra(String nombre, int masa , boolean habitable) {
		super(nombre,masa,habitable);
		poblacion = 8;
	}

	@Override
	public int getTipo() {
		return Planeta.ROCOSO;
	}

	@Override
	public String toString() {
		return "Tierra [poblacion=" + poblacion + ", nombre=" + nombre + ", masa=" + masa + ", habitable=" + habitable+
				";";
	}

	

}
