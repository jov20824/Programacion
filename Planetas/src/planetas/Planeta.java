package planetas;

public abstract class Planeta {
	
	public static final int ROCOSO = 1;
	public static final int GASEOSO = 2;
	
	
	protected String nombre;
	protected int masa;
	protected boolean habitable;

	public Planeta(String nombre, int masa, boolean habitable) {
		this.nombre = nombre;
		this.masa = masa;
		this.habitable = habitable;
	}

	public abstract int getTipo();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMasa() {
		return masa;
	}

	public void setMasa(int masa) {
		this.masa = masa;
	}

	public boolean isHabitable() {
		return habitable;
	}

	public void setHabitable(boolean habitable) {
		this.habitable = habitable;
	}
	
}
