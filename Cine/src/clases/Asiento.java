package clases;

public class Asiento {
	
	private boolean ocupado;
	private boolean bloqueado;
	private int fila;
	private int columna;
	
	public Asiento(boolean o , boolean b) {
		ocupado = o;
		bloqueado = b;
	}
	protected Asiento(boolean o, boolean b, int f, int c) {
		ocupado = o;
		bloqueado = b;
		fila = f;
		columna = c;
	}
	
	@Override
	public String toString() {
		String devolver="";
//		if (bloqueado) {
//			devolver= " Asiento f=" + fila + ", c=" + columna+" [X=" + ocupado + ", ([] "
//					+ "]";
//		}
//		else if (ocupado) {
//			devolver= " Asiento f=" + fila + ", c=" + columna+" [X=" + ocupado +"       "
//					+ "]";
//		}
//		else {
//			devolver= " Asiento f=" + fila + ", c=" + columna+" [X=" + ocupado +"      "
//					+ "]";
//		}
		if (!ocupado) {
			devolver= " ";
		}
		if (bloqueado) {
			devolver="#";
		}
		else if (ocupado) {
			devolver="X";
		}
		else if(!bloqueado) {
			devolver= " ";
		}
		
		return devolver;
		
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	
	
	
	
}
