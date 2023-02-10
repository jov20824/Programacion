package main;

import clases.Baraja;
import clases.Mano;

public class Start {

	public static void main(String[] args) {
		
		Baraja v = new Baraja();
		v.generarBaraja();
		System.out.println(v);
		Mano m = new Mano("Luis",4);
//		System.out.println(m);
//		m.cogerCarta(v.darCarta());
//		m.cogerCarta(v.darCarta());
//		m.cogerCarta(v.darCarta());
//		m.cogerCarta(v.darCarta());
//		System.out.println(m);
//		m.cogerCarta(v.darCarta());
//		System.out.println(v);
//		System.out.println(m);
		for (int i = 0; i < 53; i++) {
			v.darCarta();
		}
	}

}
