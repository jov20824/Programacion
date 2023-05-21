package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import product.Producto;

public class Read {
	
	
	public final static String FICHERO1 = "C:\\Users\\aleja\\Documents\\ST1.txt";
	
	public final static String FICHERO2 = "C:\\Users\\aleja\\Documents\\ST2.txt";
	
	
	
	public static Iterator<Producto> LeerStock(String fichero){
		
		BufferedReader ficheroEntrada; 
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Iterator<Producto> devolver = null;
		try {
 			ficheroEntrada = new BufferedReader(new FileReader(fichero));
			
			String ID = ficheroEntrada.readLine();
			while (ID!=null) {
				
				String nombre=ficheroEntrada.readLine();
				String cantidad=ficheroEntrada.readLine();
				String precio=ficheroEntrada.readLine();
				
				Producto listado = ProductoCreator.crearProducto(ID,nombre,cantidad,precio);
				productos.add(listado);
				ID=ficheroEntrada.readLine();
				devolver = productos.iterator();
			}
				
			ficheroEntrada.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return devolver;
	}
}
