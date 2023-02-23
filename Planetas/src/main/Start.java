package main;

import java.util.Arrays;

import comparador.Comparador;
import planetas.Marte;
import planetas.Planeta;
import planetas.Saturno;
import planetas.Tierra;

public class Start {

	public static void main(String[] args) {
		
		Tierra tierra = new Tierra("Tierra",1200,true);
		Marte marte = new Marte("Marte",800,false);
		Saturno saturno = new Saturno("Saturno",5000,false);
		
		Planeta[] listaP = new Planeta[3];
		listaP[0] = tierra;
		listaP[1] = marte;
		listaP[2] = saturno;
		
		
		Comparador comparar = new Comparador();
		comparar.setOrdenar(Comparador.NOMBRE);
		Arrays.sort(listaP,comparar);
		
		System.out.println(Arrays.toString(listaP));
	}

}
