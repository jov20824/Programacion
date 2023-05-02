package objects;

import java.util.ArrayList;

import Errores.CasillaOcupadaException;

public class Tablero {

	private final int FILAS=10;
	private final int COLUMNAS=9;
	
	private Mina[][] tablero;
	
	public Tablero() {
		tablero = new Mina[FILAS][COLUMNAS];
	}
	
	public void colocarMinas (ArrayList<Mina> minas) {
		
		try {
			for(Mina m: minas) {
				int fila=m.getFila();
				int columna=m.getColumna();
				this.tablero[fila][columna]=m;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	
	
	@Override
	public String toString() {
		
		Mina mina = new Mina();
		String devolver = "";
		
		for(int i = 0;i<FILAS;i++) {
			for(int j = 0;j<COLUMNAS;j++) {
				mina = tablero[i][j];
				
				if (tablero[i][j]!=null) {
					devolver+="["+mina.toString()+"]";
				}
				else {
					devolver+="[ ]";
				}
				
			}
			devolver+="\n";
		}
		return devolver;
	}
}
