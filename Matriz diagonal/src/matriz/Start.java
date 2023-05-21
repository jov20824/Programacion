package matriz;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		
		int filas=7;
		int columnas=7;
		int[][] matriz = new int[filas][columnas];
		
//		int i=0;
//		int j=0;
//		int posicion=0;
//		int numero=0;
//		boolean cambio=false;
//		
//		while (j<5 | i<5) {
//			if (j<0 & !cambio) {
//				if (i==5) {
//					cambio=true;
//					posicion=0;
//				}
//				else {
//					j=posicion;
//					i=0;
//					posicion++;
//				}	
//			}
//			if ((i>5|j<0) & cambio) {
//				i=posicion;
//				j=5;
//				posicion++;
//			}
//			if ((i<6)&(j>=0)) {
//				matriz[i][j]=numero;
//				numero++;
//				i++;
//				j--;
//			}
//			
//		}	
		
		//Manu eres un psicópata.
		
		int n = 0;
        int x = matriz[0].length;
        int y = matriz.length;
        
        for(int i = 0; i < x*2; i++) {
            int col = i+1;
            for(int j = 0; j < y; j++) {
                col--;
                if(!(col < 0 || col >= x))
                    matriz[j][col] = n++;
            }
        }

		
		for (int z=0;z<matriz.length;z++) {
			for (int u=0;u<matriz.length;u++) {
				if(matriz[z][u]<10) {
					System.out.print("0"+matriz[z][u]+" ");
				}
				else System.out.print(matriz[z][u]+" ");
				
			}
			System.out.println();
		}
		
}
}
