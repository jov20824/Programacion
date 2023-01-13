package start;

import clases.Lucha;
import clases.Pokemon;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon charizard = new Pokemon("charizard");
		System.out.println(charizard);
		Pokemon blastoise = new Pokemon("blastoise");
		System.out.println(blastoise);
		Pokemon ganador = Lucha.lucha(charizard, blastoise);
		System.out.println(ganador);
		
	}

}
