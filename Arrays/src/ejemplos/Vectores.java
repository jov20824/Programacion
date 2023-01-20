package ejemplos;

import java.util.Arrays;

public class Vectores {
	
	private int[] datos;
	
	
	public Vectores() {
		
		this.datos = num;
		
	}


	@Override
	public String toString() {
		String devolver = "[";
		
		for (int i=0; i<datos.length;i++) {
			devolver+=datos[i]+",";
		}
		devolver+="]";
		
		return devolver;
	}
	
	
	
}	
