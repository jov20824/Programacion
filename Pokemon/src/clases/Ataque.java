package clases;

public class Ataque {
	
	protected String nombre;
	protected String tipo;
	protected int danio;
	protected int precision;
	
	public Ataque (String nombre) {
		this.nombre=nombre;
		this.cual();
	}
	private void cual () {
		
		if (this.nombre=="llamarada") {
			this.tipo="fuego";
			this.danio=110;
			this.precision=75;
		}
		if (this.nombre=="lanzallamas") {
			this.tipo="fuego";
			this.danio=90;
			this.precision=100;
		}
		if (this.nombre=="restaurar") {
			this.tipo="nada";
			this.danio=85;
			this.precision=100;
		}
		if (this.nombre=="hidrobomba") {
			this.tipo="agua";
			this.danio=110;
			this.precision=75;
		}
		if (this.nombre=="pistola agua") {
			this.tipo="agua";
			this.danio=90;
			this.precision=100;
		}
		if (this.nombre=="restaurar") {
			this.tipo="nada";
			this.danio=85;
			this.precision=100;
		}
		if (this.nombre=="rayo solar") {
			this.tipo="planta";
			this.danio=110;
			this.precision=75;
		}
		if (this.nombre=="latigo cepa") {
			this.tipo="planta";
			this.danio=90;
			this.precision=100;
		}
		if (this.nombre=="restaurar") {
			this.tipo="planta";
			this.danio=85;
			this.precision=100;
		}
	}
	@Override
	public String toString() {
		return "Ataque [nombre=" + nombre + ", tipo=" + tipo + ", danio=" + danio + ", precision=" + precision + "]";
	}
	
}
