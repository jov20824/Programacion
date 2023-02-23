package planetas;

public class Saturno extends Planeta {
	
	private int numeroAnillos;
	
	public Saturno(String nombre, int masa, boolean habitable) {
		super(nombre, masa, habitable);
		numeroAnillos = 3;
	}

	@Override
	public int getTipo() {
		return Planeta.GASEOSO;
	}

}
