package clases;

public class Proyecto {
	
	private int id;
	public String poblaciones;
	public String pais;
	public int numeroHabitantes;
	public int importeInversion;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPoblaciones() {
		return poblaciones;
	}
	public void setPoblaciones(String poblaciones) {
		this.poblaciones = poblaciones;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	public int getImporteInversion() {
		return importeInversion;
	}
	public void setImporteInversion(int importeInversion) {
		this.importeInversion = importeInversion;
	}
	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", poblaciones=" + poblaciones + ", pais=" + pais + ", numeroHabitantes="
				+ numeroHabitantes + ", importeInversion=" + importeInversion + "]";
	}
	
	
}
