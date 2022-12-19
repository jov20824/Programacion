package museo;

public class ObjArqueologico {
	
	
	private String nombre;
	private int año;
	private String material;
	private Ubicacion ubicacion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "ObjArqueologico [nombre=" + nombre + ", año=" + año + ", material=" + material + ", ubicacion="
				+ ubicacion + "]";
	}
	
	
	
}
