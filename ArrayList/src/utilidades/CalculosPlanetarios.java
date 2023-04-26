package utilidades;

import java.util.Iterator;

import planeta.Planeta;

public class CalculosPlanetarios {

	public static double distanciaMediaSolar(Iterator<Planeta> i) {

		double distanciaMedia = 0;
		int cuenta = 0;
		while(i.hasNext()) {
			Planeta p = i.next();
			distanciaMedia+=p.getDistancia();
			cuenta++;
		}
		return distanciaMedia /= cuenta;
	}
	
	public static Planeta distanciaMaxima(Iterator<Planeta> i) {
		
		Planeta maximo = null;
		
		while(i.hasNext()) {
			Planeta p = i.next();
			if (maximo==null) {
				maximo = p;
			}
			else if (p.getDistancia()>maximo.getDistancia()) {
				maximo = p;
			}
		}
		return maximo;
		
		
	}
}
