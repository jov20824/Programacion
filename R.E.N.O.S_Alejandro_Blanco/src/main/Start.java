package main;

import clases.Gimnasio;
import clases.Robot;

public class Start {

	public static void main(String[] args) {
		
		Robot marcos = new Robot("Marcos");
		
		Robot juanjo = new Robot("Juanjo");

		
		System.out.println(marcos);
		
		System.out.println(juanjo);
		
		
		Robot ganador = Gimnasio.lucha(marcos,juanjo);
		
		System.out.println(ganador);
		
	}

}
