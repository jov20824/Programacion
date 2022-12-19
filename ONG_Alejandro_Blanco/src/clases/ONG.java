package clases;

public class ONG {
	
	private String nombre;
	private Sede sede1;
	private Sede sede2;
	private Sede sede3;
	
	public ONG () {
		nombre="Marcos sin fronteras";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sede getSede1() {
		return sede1;
	}

	public void setSede1(Sede sede1) {
		this.sede1 = sede1;
	}

	public Sede getSede2() {
		return sede2;
	}

	public void setSede2(Sede sede2) {
		this.sede2 = sede2;
	}

	public Sede getSede3() {
		return sede3;
	}

	public void setSede3(Sede sede3) {
		this.sede3 = sede3;
	}

	@Override
	public String toString() {
		return "ONG [nombre=" + nombre + "\n sede1=" + sede1 + "\n sede2=" + sede2 + "\n sede3=" + sede3 + "]";
	}
	
	
}
