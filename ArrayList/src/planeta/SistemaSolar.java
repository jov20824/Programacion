package planeta;

import java.util.ArrayList;
import java.util.Iterator;

import errores.PlanetaRepetidoException;
import errores.SistemaSolarLlenoException;
import utilidades.ComparadorPlanetas;
import utilidades.Read;

public class SistemaSolar {

	private ArrayList<Planeta> sistemaSolar;

	public SistemaSolar() {
		Read read = new Read();
//		sistemaSolar = read.crearPlaneta();
	}
	public SistemaSolar(ArrayList<Planeta> ss) {
		sistemaSolar = ss;
	}
	
	
	public void añadirPlaneta(Planeta planeta) throws Exception {
		if ((sistemaSolar.size()<4)) {
			if(!sistemaSolar.contains(planeta)) {
				sistemaSolar.add(planeta);
			}
			else {
				String texto = "planeta ya añadido";
				PlanetaRepetidoException error = new PlanetaRepetidoException(texto);
				throw error;
			}
		}
		else {
			String texto = "4 planetas como máximo " + sistemaSolar.size();
			SistemaSolarLlenoException error = new SistemaSolarLlenoException(texto);
			throw error;
		}
	}
	
	public double distanciaMedia() {
		
		Iterator<Planeta> i = sistemaSolar.iterator();
		double suma = 0;
		while(i.hasNext()) {
			Planeta p = i.next();
			suma+=p.getDistancia();
			
		}
		return suma/sistemaSolar.size();
	}
	
	public void recorrer() {
		
//		for(Planeta p: this.sistemaSolar) {
//			System.out.println(p.getNombre());
//		}
		
		Iterator<Planeta> i = sistemaSolar.iterator();
		while(i.hasNext()) {
			Planeta p = i.next();
			System.out.println(p.getNombre());
		}
	}
	
	public void ordenar() {
		
		sistemaSolar.sort(new ComparadorPlanetas());
	}
	
	public Iterator<Planeta> getPlanetas(){
		return sistemaSolar.iterator();
	}
	
	@Override
	public String toString() {
		return sistemaSolar.toString();
	}

}
