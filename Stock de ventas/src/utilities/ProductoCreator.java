package utilities;

import product.Producto;

public class ProductoCreator {

	
	public static Producto crearProducto(String ID, String nombre, String cantidad, String precio) {
	
		Producto producto = new Producto();
		
		producto.setID(ID);
		producto.setNombre(nombre);
		
		try {
			producto.setCantidad(Integer.parseInt(cantidad));
			producto.setPrecio(Double.parseDouble(precio));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return producto;
	}

}
