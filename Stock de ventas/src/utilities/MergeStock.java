package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import product.Producto;

public class MergeStock {

	public static Iterator<Producto> mergeData(Iterator<Producto> p1,Iterator<Producto> p2) throws ProductosIncompatiblesException {
		
		TreeMap<String,Producto> t1=new TreeMap<String,Producto>();
		TreeMap<String,Producto> t2=new TreeMap<String,Producto>();
		
		while (p1.hasNext()) {
			Producto p = p1.next();
			t1.put(p.getID(), p);
		}
		while (p2.hasNext()) {
			Producto p = p2.next();
			t2.put(p.getID(), p);
		}
		
		for (Map.Entry<String,Producto> entry1: t1.entrySet()){
			
			if (t2.containsKey(entry1.getKey())) {
				if (t2.get(entry1.getKey()).getPrecio()!=entry1.getValue().getPrecio()) {
					ProductosIncompatiblesException e = new ProductosIncompatiblesException("Productos con el mismo ID y precios distintos");
					throw e;
				}
				else {
					t2.get(entry1.getKey()).setCantidad(t2.get(entry1.getKey()).getCantidad()+t1.get(entry1.getKey()).getCantidad());
				}
			}
			else {
				t2.put(entry1.getKey(), entry1.getValue());
			}
		}
		Collection<Producto> cp = t2.values();
		Iterator<Producto> devolver = cp.iterator();
		
		return devolver;
	}
}
