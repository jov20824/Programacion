package comparador;

import java.util.Comparator;

import planetas.Planeta;

public class Comparador implements Comparator<Planeta> {
	
	public static final int MASA = 29847;
	public static final int NOMBRE = 89347924;
	private int ordenar;
	
	public int compare(Planeta o1, Planeta o2) {
		int devolver=0;
		
		if (ordenar==MASA) {
			devolver=o2.getMasa()-o1.getMasa();
		}
		if (ordenar==NOMBRE) {
			devolver=o1.getNombre().compareTo(o2.getNombre());
		}
		return devolver;
	}
	
	public void setOrdenar(int como) {
		if (como == MASA) {
			ordenar=MASA;
		}
		if (como == NOMBRE) {
			ordenar=NOMBRE;
		}
	}
	
}
