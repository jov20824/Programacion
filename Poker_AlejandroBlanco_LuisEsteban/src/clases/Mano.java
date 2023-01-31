package clases;

import java.util.Arrays;

public class Mano {
	protected Carta[] cartas;
	private String nombreMano;
	protected int indice;
	protected int numeroCartas;
	
	public Mano(String nombreMano , int tamanioMano) {
		this.nombreMano = nombreMano;
		cartas = new Carta[tamanioMano];
	}
	
	public void cogerCarta (Carta cartaRobada) {
		if (indice == cartas.length) {
			indice = 0;
		}
		cartas[indice] = cartaRobada;
		indice++;
		numeroCartas++;
	}

	@Override
	public String toString() {
		return "Mano [nombreMano =" +nombreMano + " cartas=" + Arrays.toString(cartas) + ", indice=" + indice
				+ ", numeroCartas=" + numeroCartas + "]";
	}
	
}
