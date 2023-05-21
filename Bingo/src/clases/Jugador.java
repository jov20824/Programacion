package clases;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	
	private ArrayList<Carton> cartones;
	
	public Jugador(String nombre, int cantidadCartones) {
		this.nombre = nombre;
		cartones = this.generarCartones(cantidadCartones);
	}
	
	private ArrayList<Carton> generarCartones(int cantidad){
		
		ArrayList<Carton> devolver = new ArrayList<Carton>();
		
		for (int i=0;i<cantidad;i++) {
			devolver.add(new Carton());
		}
		return devolver;
	}

	public ArrayList<Carton> getCartones(){
		return cartones;
		
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", cartones=" + cartones + "]";
	}
	
}
