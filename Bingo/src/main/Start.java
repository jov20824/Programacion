package main;

import java.util.ArrayList;

import clases.Bombo;
import clases.Carton;
import clases.Jugador;
import juego.Partida;

public class Start {

	public static void main(String[] args) {
				
		Jugador luis = new Jugador("Luis",2);
		Jugador jandro = new Jugador("Jandro",2);
		Jugador lorena = new Jugador("Lorena",3);
		Jugador pablo = new Jugador("Pablo",1);
		
		ArrayList<Jugador> participantes = new ArrayList<Jugador>();
		participantes.add(luis);
		participantes.add(jandro);
		participantes.add(lorena);
		participantes.add(pablo);
		
		Jugador ganador = Partida.jugarPartida(participantes);
		System.out.println(ganador);
	}

}
