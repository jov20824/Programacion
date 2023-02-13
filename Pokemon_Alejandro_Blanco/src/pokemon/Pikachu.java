package pokemon;

public class Pikachu extends Pokemon implements Evolucionador{

	private int cargaElectrica;
	
	public Pikachu(String nombre) {
		super(nombre);
		cargaElectrica = 100;
	}

	
	@Override
	public int getTipo() {
		return Pokemon.POKEMON_ELECTRICO;
	}


	@Override
	public int ataque() {
		return 90;
	}


	@Override
	public int defensa() {
		// TODO Auto-generated method stub
		return 50;
	}
	@Override
	public Pokemons evolucion() {
		return Evolucionador.Pokemons.RAICHU;
	}
}
