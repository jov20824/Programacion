package clases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {

	private ArrayList<String> lineas;
	private final String FICHERO_SALIDA = ("C:\\Users\\aleja\\Documents\\comandas.txt");
	private FileWriter fichero;
	
	public Writer() {	
	}
	public void escribirFichero(Restaurante restaurante) {
		try {
			fichero = new FileWriter(FICHERO_SALIDA);
			for(Comanda c: restaurante.getComandas()) {
				fichero.write(c.toString()+"\n");
			}
			fichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
