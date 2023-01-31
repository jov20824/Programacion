package ejemplos;

import java.util.Arrays;

public class Vectores {
	
	private int[] datos;
	private int elementos=0;
	
	public Vectores() {
		
		this.datos = new int [10];
		elementos =0;
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
