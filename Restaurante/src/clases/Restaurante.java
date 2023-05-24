package clases;

import java.util.ArrayList;

public class Restaurante {
	
	private ArrayList<Comanda> comandas;
	
	public Restaurante() {
		comandas = new ArrayList<Comanda>();
	}
	
	public void addComanda(Comanda comanda) {
		comandas.add(comanda);
	}
	
	public void atenderComanda(Comanda comanda) {
		comandas.remove(comanda);
	}
	
	public ArrayList<Comanda> getComandas() {
		return comandas;
	}

	@Override
	public String toString(){
		return comandas.toString();
	}

	public ArrayList<String> getNombreComandas() {
		ArrayList<String> devolver = new ArrayList<String>();
		String nombres;
		for(Comanda c: comandas) {
			nombres = c.getNombre();
			devolver.add(nombres);
		}
		return devolver;
	}
	
}
