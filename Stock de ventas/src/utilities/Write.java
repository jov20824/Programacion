package utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import product.Producto;
import product.Stock;
public class Write {

	private final String FICHERO_SALIDA = ("C:\\Users\\aleja\\Documents\\STFinal.txt");
	
	public Write() {	
	}

	public Stock escribirFichero(Iterator<Producto> fichero1,Iterator<Producto> fichero2) {
		
		FileWriter fichero;
		Stock devolver = new Stock();
		try {
			fichero = new FileWriter(FICHERO_SALIDA);
			Iterator<Producto> fichero3 = MergeStock.mergeData(fichero1, fichero2);	
			ArrayList <Producto> copia = new ArrayList<Producto>();
			while (fichero3.hasNext()){
				
				Producto p = fichero3.next();
				fichero.write(p.toString()+"\n");
				copia.add(p);
			}
			
			devolver.setProductos(copia.iterator());
			fichero.close();
			return devolver;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return devolver;
	}
}
