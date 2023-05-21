package product;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import utilities.Read;

public class Stock {

	private TreeMap<String,Producto> productos;
	
	public Stock() {
		productos = new TreeMap<String,Producto>();
	}
	
	public Stock(String fichero) {
		
		if (fichero==Read.FICHERO1 | fichero==Read.FICHERO2) {
		
			Iterator<Producto> x = Read.LeerStock(fichero);
			productos = new TreeMap<String,Producto>();
			
			while (x.hasNext()) {
				Producto producto = x.next();
				productos.put(producto.getID(), producto);
			}
		}	
	}
	
	public Iterator<Producto> getStock(){
		
		Collection<Producto> x = productos.values();
		Iterator<Producto> devolver = x.iterator();
		
		return devolver;
	}
	
	
	public void setProductos(Iterator<Producto> p) {
		while (p.hasNext()) {
			Producto producto = p.next();
			productos.put(producto.getID(), producto);
		}
	}
	
	@Override
	public String toString() {
		return "Stock [productos=" + productos + "]";
	}
	
	
	
}
