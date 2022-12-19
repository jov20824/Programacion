package clases;

public class Sede {
	
	private String pais;
	private String ciudad;
	private String direccion;
	private int telefonoReferencia;
	private String nombreDirector;
	private Proyecto proyecto1;
	private Proyecto proyecto2;
	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefonoReferencia() {
		return telefonoReferencia;
	}
	public void setTelefonoReferencia(int telefonoReferencia) {
		this.telefonoReferencia = telefonoReferencia;
	}
	public String getNombreDirector() {
		return nombreDirector;
	}
	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}
	public Proyecto getProyecto1() {
		return proyecto1;
	}
	public void setProyecto1(Proyecto proyecto1) {
		this.proyecto1 = proyecto1;
	}
	public Proyecto getProyecto2() {
		return proyecto2;
	}
	public void setProyecto2(Proyecto proyecto2) {
		this.proyecto2 = proyecto2;
	}
	@Override
	public String toString() {
		return "Sede [\npais=" + pais + "\n ciudad=" + ciudad + "\n direccion=" + direccion + "\n telefonoReferencia="
				+ telefonoReferencia + "\n nombreDirector=" + nombreDirector + "\n proyecto1=" + proyecto1
				+ "\n proyecto2=" + proyecto2 + "]";
	}
	
	
}
