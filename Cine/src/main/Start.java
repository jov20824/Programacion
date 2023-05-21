package main;

import clases.Asiento;
import clases.Sala;
import clases.Sala.Modo;

public class Start {

	public static void main(String[] args) {
		
		Sala sala = new Sala(7,7,Modo.COVID,2);
		
		System.out.println(sala);
		
		System.out.println(sala.reservarAsiento(0, 0));
		System.out.println(sala.reservarAsiento(5, 0));
		System.out.println(sala.reservarAsiento(2, 3));
		System.out.println(sala.reservarAsiento(2, 2));
		
		System.out.println(sala);
		
		System.out.println(sala.cancelarAsiento(0, 0));
		System.out.println(sala.cancelarAsiento(2, 2));
		
		System.out.println(sala);
		
	}

}
