package pokemon;

import peleador.Peleador;

public abstract class Pokemon implements Peleador{
	
	public static final int POKEMON_ELECTRICO = 100;
	public static final int POKEMON_FUEGO = 200;
	public static final int POKEMON_AGUA = 300;
	
	protected String nombre;
	
	
	public Pokemon(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract int getTipo();
}
