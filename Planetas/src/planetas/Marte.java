package planetas;

public class Marte extends Planeta {

	private boolean marcianos;
	
	public Marte(String nombre, int masa, boolean habitable) {
		super(nombre, masa, habitable);
		marcianos = true;
	}

	@Override
	public int getTipo() {
		return Planeta.ROCOSO;
	}

}
