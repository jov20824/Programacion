package matriz;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		
		int filas=7;
		int columnas=7;
		int[][] matriz = new int[filas][columnas];
		
		int i=0;
		int j=0;
		int posicion=0;
		int numero=0;
		boolean cambio=false;
		
		while (j<(columnas-1) | i<(filas-1)) {
			if (j<0 & !cambio) {
				if (i==(filas-1)) {
					cambio=true;
					posicion=0;
				}
				else {
					j=posicion;
					i=0;
					posicion++;
				}	
			}
			if ((i>(filas-1)|j<0) & cambio) {
				i=posicion;
				j=(columnas-1);
				posicion++;
			}
			if ((i<filas)&(j>=0)) {
				matriz[i][j]=numero;
				numero++;
				i++;
				j--;
			}
			
		}	
		
		for (int x=0;x<matriz.length;x++) {
			for (int u=0;u<matriz.length;u++) {
				if(matriz[x][u]<10) {
					System.out.print("0"+matriz[x][u]+" ");
				}
				else System.out.print(matriz[x][u]+" ");
				
			}
			System.out.println();
		}
		
}
}
