package objects;

public class Mina {

	private int fila;
	private int columna;
	
	public Mina() {
		fila = -1;
		columna = -1;
	}
	
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) throws IndexOutOfBoundsException{
		if (fila<10 | fila >0) {
			this.fila = fila;
		}
		else {
			IndexOutOfBoundsException e = (IndexOutOfBoundsException) new Exception();
			throw e;
		}
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) throws IndexOutOfBoundsException {
		if (columna<9 | columna>0) {
			this.columna = columna;
		}
		else {
			IndexOutOfBoundsException e = (IndexOutOfBoundsException) new Exception();
			throw e;
		}
	}

	@Override
	public String toString() {
		return "X";
	}
	
	
}
