package pokemon;

public class Squirtle extends Pokemon implements Evolucionador{

	public static final String EVO_WARTORTLE 
	private int segundosBajoAgua;
	
	public Squirtle(String nombre) {
		super(nombre);
		segundosBajoAgua = 100;
	}

	@Override
	public int getTipo() {
		return Pokemon.POKEMON_AGUA;
	}

	@Override
	public int ataque() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public int defensa() {
		// TODO Auto-generated method stub
		return 70;
	}
	public String evolucion() {
		return "Wartortle";
	}
}
