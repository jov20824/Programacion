package clases;

public class Robot {
	
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	
	public Robot (String nombre) {
		this.nombre=nombre;
		vida=100;
		ataque = (int)(Math.random()*21);
		defensa = (int)(Math.random()*101);

	}
	
	public Robot lucha (Robot uno) {
		
		if (uno.ataque ==0 && this.ataque == 0) {
			return null;
		}
		while (this.vida >0 && uno.vida >0) {
			
			if ( this.aleatorio() > uno.defensa) {
				uno.vida = uno.vida - this.ataque;
			}
			
			if ( uno.aleatorio() > this.defensa) {
				this.vida = this.vida - uno.ataque;
			}
		}
		
		if (this.vida <=0) {
			return uno;
		}
		else {
			return this;
		}
	}
	
	private int aleatorio() {
		
		int numero = (int)(Math.random()*101);
		
		return numero;
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
