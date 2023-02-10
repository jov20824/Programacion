package pokemon;

public class Charmander extends Pokemon implements Evolucionador {

	private int potenciaFuegoCola;
	
	public Charmander(String nombre) {
		super(nombre);
		potenciaFuegoCola = 100;
	}

	@Override
	public int getTipo() {
		return Pokemon.POKEMON_FUEGO;
	}

	@Override
	public int ataque() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public int defensa() {
		// TODO Auto-generated method stub
		return 60;
	}
	public String evolucion() {
		
		return "Charmeleon";
	}
}
