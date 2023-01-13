package clases;

public class Pokemon {
	
	protected String nombre;
	protected String tipo;
	protected int vida;
	protected int danio;
	protected int defensa;
	protected int velocidad;
	protected Ataque a1;
	protected Ataque a2;
	protected Ataque a3;

	public Pokemon (String nombre) {
		this.nombre=nombre;
		this.eleccion();
		
	}
	
	private void eleccion() {
		
		if (this.nombre=="charizard") {
			this.tipo="fuego";
			this.vida=450;
			this.danio=100;
			this.defensa=50;
			this.velocidad=100;
			a1 = new Ataque ("llamarada");
			a2= new Ataque ("lanzallamas");
			a3= new Ataque ("restaurar");
		}
		if (this.nombre=="blastoise") {
			this.tipo="agua";
			this.vida=500;
			this.danio=90;
			this.defensa=60;
			this.velocidad=80;
			a1 = new Ataque ("hidrobomba");
			a2 = new Ataque ("pistola agua");
			a3= new Ataque ("restaurar");
		}
		if (this.nombre=="venusaur") {
			this.tipo="planta";
			this.vida=600;
			this.danio=80;
			this.defensa=80;
			this.velocidad=65;
			a1 = new Ataque ("rayo solar");
			a2= new Ataque ("latigo cepa");
			a3= new Ataque ("restaurar");
		}
	}
	
	
	
	
	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", vida=" + vida + ", danio=" + danio + ", defensa="
				+ defensa + ", velocidad=" + velocidad + "\n a1=" + a1 + "\n a2=" + a2 + "\n a3=" + a3 + "]";
	}
	
	
	
	
}
