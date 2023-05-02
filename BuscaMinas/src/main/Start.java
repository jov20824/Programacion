package main;

import objects.Tablero;
import utilidades.Read;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tablero tablero = new Tablero();
		tablero.colocarMinas(Read.recogerPosiciones());
		System.out.println(tablero);
	}

}
