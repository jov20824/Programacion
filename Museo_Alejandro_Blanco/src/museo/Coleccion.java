package museo;

public class Coleccion {
	
	private String nombre;
	private String epoca;
	private int numeroObjetos;
	private ObjArqueologico objeto1;
	private ObjArqueologico objeto2;
	private ObjArqueologico objeto3;
	private ObjArqueologico objeto4;
	private ObjArqueologico objeto5;
	private ObjArqueologico objeto6;
	private ObjArqueologico objeto7;
	private ObjArqueologico objeto8;
	private ObjArqueologico objeto9;
	private ObjArqueologico objeto10;
	
	public Coleccion(String nombre, String epoca) {
		this.nombre=nombre;
		this.epoca=epoca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	public int getNumeroObjetos() {
		return numeroObjetos;
	}

	public void setNumeroObjetos(int numeroObjetos) {
		this.numeroObjetos = numeroObjetos;
	}

	public ObjArqueologico getObjeto1() {
		return objeto1;
	}

	public void setObjeto1(ObjArqueologico objeto1) {
		this.objeto1 = objeto1;
	}

	public ObjArqueologico getObjeto2() {
		return objeto2;
	}

	public void setObjeto2(ObjArqueologico objeto2) {
		this.objeto2 = objeto2;
	}

	public ObjArqueologico getObjeto3() {
		return objeto3;
	}

	public void setObjeto3(ObjArqueologico objeto3) {
		this.objeto3 = objeto3;
	}

	public ObjArqueologico getObjeto4() {
		return objeto4;
	}

	public void setObjeto4(ObjArqueologico objeto4) {
		this.objeto4 = objeto4;
	}

	public ObjArqueologico getObjeto5() {
		return objeto5;
	}

	public void setObjeto5(ObjArqueologico objeto5) {
		this.objeto5 = objeto5;
	}

	public ObjArqueologico getObjeto6() {
		return objeto6;
	}

	public void setObjeto6(ObjArqueologico objeto6) {
		this.objeto6 = objeto6;
	}

	public ObjArqueologico getObjeto7() {
		return objeto7;
	}

	public void setObjeto7(ObjArqueologico objeto7) {
		this.objeto7 = objeto7;
	}

	public ObjArqueologico getObjeto8() {
		return objeto8;
	}

	public void setObjeto8(ObjArqueologico objeto8) {
		this.objeto8 = objeto8;
	}

	public ObjArqueologico getObjeto9() {
		return objeto9;
	}

	public void setObjeto9(ObjArqueologico objeto9) {
		this.objeto9 = objeto9;
	}

	public ObjArqueologico getObjeto10() {
		return objeto10;
	}

	public void setObjeto10(ObjArqueologico objeto10) {
		this.objeto10 = objeto10;
	}

	@Override
	public String toString() {
		return "Coleccion [nombre=" + nombre + ", epoca=" + epoca + ", numeroObjetos=" + numeroObjetos + "\n objeto1="
				+ objeto1 + "\n objeto2=" + objeto2 + "\n objeto3=" + objeto3 + "\n objeto4=" + objeto4 + "\n objeto5="
				+ objeto5 + "\n objeto6=" + objeto6 + "\n objeto7=" + objeto7 + "\n objeto8=" + objeto8 + "\n objeto9="
				+ objeto9 + "\n objeto10=" + objeto10 + "]";
	}
	
}
