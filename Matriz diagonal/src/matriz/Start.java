package matriz;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		
		int[][] matriz = new int[6][6];
		
		int i=0;
		int j=0;
		int posicion=0;
		int numero=0;
		boolean cambio=false;
		
		while (j<5 | i<5) {
			if (j<0 & !cambio) {
				if (i==5) {
					cambio=true;
					posicion=0;
				}
				else {
					j=posicion;
					i=0;
					posicion++;
				}	
			}
			if ((i>5|j<0) & cambio) {
				i=posicion;
				j=5;
				posicion++;
			}
			if ((i<6)&(j>=0)) {
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
