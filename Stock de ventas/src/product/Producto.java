package product;

public class Producto {

	private String ID;
	private String nombre;
	private int cantidad;
	private double precio;
	
	public Producto(String ID,String nombre, int cantidad, double precio) {
		this.ID = ID;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Producto() {
	}

	public String getID() {
		return ID;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setID(String iD) {
		ID = iD;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [ID=" + ID + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
}
