package clases;

import java.util.Arrays;

public class Baraja {
	private Carta[] cartas;
	
	public Baraja() {
		this.cartas = new Carta[54];
		
	}
	
	public Carta[] generarBaraja() {
		String palo = "";
		String numero = "";
		int posicion =0;
		
		for (int i=0 ; i<4 ; i++) {
			
			switch(i) {
			case(0):palo=" de corazones";break;
			case(1):palo=" de rombos";break;
			case(2):palo=" de treboles";break;
			case(3):palo=" de picas";break;
			}
			
			for (int j=0 ; j<13 ; j++) {
				switch(j) {
				case(0):numero="As";break;
				case(1):numero="2";break;
				case(2):numero="3";break;
				case(3):numero="4";break;
				case(4):numero="5";break;
				case(5):numero="6";break;
				case(6):numero="7";break;
				case(7):numero="8";break;
				case(8):numero="9";break;
				case(9):numero="10";break;
				case(10):numero="J";break;
				case(11):numero="Q";break;
				case(12):numero="K";break;
				
				}
				Carta cartaMeterla = new Carta ((numero+palo) , true);
				cartas[posicion++] = cartaMeterla; 
			}
			
			
		}
		Carta joker = new Carta ("Joker" , true);
		cartas[52] = joker;
		cartas[53] = joker;
		return cartas;
	}

	public Carta darCarta() {
		
		int aleatorio = (int)(Math.random()*cartas.length);
		int intentos=0;
		boolean encontrado=false;
		while (!encontrado & intentos<cartas.length) {
			aleatorio ++;
			intentos++;
			encontrado=true;
		}
		if (intentos==cartas.length-1) {
			return null;
		}
		if (aleatorio==54) {
			aleatorio=0;
		}
		cartas[aleatorio].enBaraja = false;
		return cartas[aleatorio];
		
		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
}
