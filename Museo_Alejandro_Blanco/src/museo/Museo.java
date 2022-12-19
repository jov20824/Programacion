package museo;

public class Museo {
	
	private String nombre;
	private int tamaño;
	private String ciudad;
	private Coleccion coleccion1;
	private Coleccion coleccion2;
	
	public Museo () {
		nombre="Museo Arqueológico";
		tamaño=300;
		ciudad="Oviedo";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Coleccion getColeccion1() {
		return coleccion1;
	}
	public void setColeccion1(Coleccion coleccion1) {
		this.coleccion1 = coleccion1;
	}
	public Coleccion getColeccion2() {
		return coleccion2;
	}
	public void setColeccion2(Coleccion coleccion2) {
		this.coleccion2 = coleccion2;
	}
	@Override
	public String toString() {
		return "Museo [nombre=" + nombre + ", tamaño=" + tamaño + ", ciudad=" + ciudad + "\n coleccion1=" + coleccion1
				+ "\n coleccion2=" + coleccion2 + "]";
	}
	
	
}
