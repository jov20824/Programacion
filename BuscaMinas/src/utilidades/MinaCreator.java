package utilidades;

import objects.Mina;

public class MinaCreator {

	public Mina crearMina(String linea) {
		
		Mina mina = new Mina();
		
		char a=(char)(linea.charAt(0));
		int fila = a - 65;
		
		char b=linea.charAt(1);
		int columna = Character.getNumericValue(b-1);
		
		try {
			mina.setFila(fila);
			mina.setColumna(columna);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			mina=null;
		}
		return mina;
	}

}
