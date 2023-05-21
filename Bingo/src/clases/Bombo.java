package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Bombo {

	private ArrayList<Integer> numeros;
	
	
	public Bombo() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		this.numeros = this.rellenar();
	}
	
	private ArrayList<Integer> rellenar() {
		
		ArrayList<Integer> devolver = new ArrayList<Integer>();
		
		for (int i = 0; i < 90; i++) {
			int x = i+1;
			devolver.add(x);
		}
		return devolver;
	}
	
	public int getRandomNumber(){
		
		int posicion = (int)(Math.random()*numeros.size());
		int numeroElegido = numeros.get(posicion);
		numeros.remove(posicion);
		return numeroElegido;
	}
//	public int getRandomNumber(){
//		int numeroElegido = (int)(Math.random()*90+1);
//		return numeroElegido;
//	}
	
	
	public ArrayList<Integer> getNumeros(){
		return numeros;
		
	}
	
	@Override
	public String toString() {
		return "Bombo [numeros=" + numeros + "]";
	}
	

	
	
}
