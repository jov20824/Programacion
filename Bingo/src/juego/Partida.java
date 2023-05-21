package juego;

import java.util.ArrayList;

import clases.Bombo;
import clases.Carton;
import clases.Jugador;

public class Partida {

	
	public static Jugador jugarPartida(ArrayList<Jugador> jugadores) {
		
		Bombo bombo = new Bombo();
		boolean isGanador = false;
		Jugador ganador = null;
		
		while(!isGanador) {
			
			int bolaSacada = bombo.getRandomNumber();

			for (Jugador j: jugadores) {
				for (Carton c: j.getCartones()) {
					if (c.getCasillas().contains(bolaSacada)) {
						c.getCasillas().remove(bolaSacada);
					}
					if (c.getCasillas().isEmpty()) {
						ganador = j;
						isGanador = true;
					}
				}
			}
		}
		return ganador;
	}
}
