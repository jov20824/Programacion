package clases;

public class Robot {
	
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	
	public Robot (String nombre) {
		this.nombre=nombre;
		vida=50;
		ataque=ataqueAleatorio();
		defensa=defensaAleatoria();
	}
	
	private int ataqueAleatorio() {
		
		int aleatorio = (int)(Math.random()*21);
		
		return aleatorio;
	}
	
	private int defensaAleatoria() {
			
		int aleatoria = (int)(Math.random()*101);
			
		return aleatoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	@Override
	
	public String toString() {
		return "Robot [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}
	
	
}
