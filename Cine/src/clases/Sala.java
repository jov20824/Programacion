package clases;

import java.util.Arrays;

public class Sala {
	
	public static enum Modo {NORMAL , COVID}
	
	private Asiento[][] sala;
	private int filas;
	private int columnas;
	
	
	public Sala(int filas, int columnas , Modo modo , int separacion) {
		this.filas=filas;
		this.columnas=columnas;
		sala = new Asiento[this.filas][this.columnas];
		this.asientos(modo,separacion);
		
		
		
	}
	
	
	private void asientos(Modo modo , int separacion) {
		
		
				
				if (modo==Sala.Modo.NORMAL) {
					for (int i=0;i<filas;i++) {
						for (int j=0;j<columnas;j++) {
							sala[i][j]= new Asiento(false,false,i,j);
						}
					}	
				}
				
				if (modo==Sala.Modo.COVID) {
					for (int i=0;i<filas;i++) {
						for (int j=0;j<columnas;j++) {
							if (j%(separacion+1)==0) sala[i][j]= new Asiento(false,false,i,j);
							else sala[i][j]= new Asiento(false,true,i,j);
						}
					}	
				}
			}
		
		
	

	public String reservarAsiento(int fila, int columna) {
		String devolver ="";
		
		if (sala[fila][columna].isBloqueado()==false && sala[fila][columna].isOcupado()==false) {
			sala[fila][columna].setOcupado(true);
			devolver="Asiento "+fila+","+columna+ " reservado\n";
		}
		else if (sala[fila][columna].isBloqueado()==true | sala[fila][columna].isOcupado()==true) {
			devolver="No ha sido posible reservar el asiento "+fila+","+columna+"\n";
		}
		return devolver;
	}
	
	public String cancelarAsiento(int fila, int columna) {
		String devolver ="";
		
		if(sala[fila][columna].isOcupado()==true) {
			sala[fila][columna].setOcupado(false);
			devolver="Reserva del asiento "+fila+","+columna+" Acancelada con éxito\n";
		}
		else if(sala[fila][columna].isOcupado()==false) {
			devolver="El asiento "+fila+","+columna+ " no ha sido reservado\n";
		}
		
		
		return devolver;
	}

	@Override
	public String toString() {
		String devolver="";
//		Asiento butaca = new Asiento(false,false);
//		for (int i=0;i<this.filas;i++) 
//			for (int j=0;j<this.columnas;j++) {
//				
//				butaca = sala[i][j];
//				devolver += butaca.toString()+"\n";
//				
//			}
		Asiento butaca = new Asiento(false,false);
		for (int i=0;i<this.filas;i++) {
			for (int j=0;j<this.columnas;j++) {
				
				butaca = sala[i][j];
				devolver += "["+butaca.toString()+"]  ";				
			}
			devolver+="\n";
		}
		return devolver;
		
	}

	public Asiento[][] getSala() {
		return sala;
	}


	public void setSala(Asiento[][] sala) {
		this.sala = sala;
	}


	public int getFilas() {
		return filas;
	}


	public void setFilas(int filas) {
		this.filas = filas;
	}


	public int getColumnas() {
		return columnas;
	}


	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
}
