package clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Carton {
	
	private int numero;
	
	private HashSet<Integer> casillas;
	
	public Carton() {
		Random aleatorio = new Random();
		numero = aleatorio.nextInt(1000);
		casillas = this.rellenar();
	}

	private HashSet<Integer> rellenar() {
		
		HashSet<Integer> devolver = new HashSet<Integer>();
		Random aleatorio = new Random();
		
		int support = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <2 ; j++) {
				
				int add = (int)(Math.random()*10+(support*10)+1);
				
				while (devolver.contains(add)) {
					add = (int)(Math.random()*10+(support*10)+1);
				}
				
				devolver.add(add);
			}
			support++;
		}
		
		return devolver;
	}
	
	public HashSet<Integer> getCasillas(){
		return casillas;
		
	}

	@Override
	public String toString() {
		return "Carton [ numero="+numero+" , casillas=" + casillas + "]";
	}
	
}
