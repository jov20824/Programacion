package main;

import clases.Comanda;
import clases.Restaurante;
import clases.Writer;

public class Start {

	public static void main(String[] args) {
		
		Restaurante casaLuis = new Restaurante();
		
		Comanda c1 = new Comanda("Tortilla");
		Comanda c2 = new Comanda("Embutidos");
		Comanda c3 = new Comanda("Croquetas");
		
		casaLuis.addComanda(c1);
		casaLuis.addComanda(c2);
		casaLuis.addComanda(c3);
		
		System.out.println(casaLuis);
		Writer escribir = new Writer();
		escribir.escribirFichero(casaLuis);
		casaLuis.atenderComanda(c1);
		
		System.out.println(casaLuis);
	}

}
