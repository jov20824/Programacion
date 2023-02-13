package Start;

import gimnasio.Gimnasio;
import pokemon.Charmander;
import pokemon.Pikachu;
import pokemon.Pokemon;
import pokemon.Squirtle;
import robot.Robot;

public class Start {

	public static void main(String[] args) {
		
		Pikachu pika = new Pikachu("Pika");
		Robot doraemon = new Robot();
		
		
		Gimnasio.batalla(pika, doraemon);
		
		Pokemon[] listaP = new Pokemon[3];
		listaP[0] = new Pikachu("Pikachu");
		listaP[1] = new Charmander("Charmander");
		listaP[2] = new Squirtle("Squirtle");
		
		
		
		for (Pokemon pok : listaP) {
			System.out.print(pok.getNombre());
			
			switch(pok.getTipo()) {
				case(Pokemon.POKEMON_ELECTRICO): System.out.print(" Electrico"); break;
				case(Pokemon.POKEMON_FUEGO): System.out.print(" Fuego"); break;
				case(Pokemon.POKEMON_AGUA): System.out.print(" Agua"); break;
			}
			System.out.println();
		}
	}

}
