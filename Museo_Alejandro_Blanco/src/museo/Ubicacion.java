package museo;

import java.util.Scanner;

public class Ubicacion {
	
	private int piso;
	private int sala;
	
	//Cosas sin acabar
//	public Ubicacion (int piso, int sala) {
//		this.piso=piso;
//		this.sala=sala;
//		;
//	}
	
//	private String setUbicacion (boolean almacen){
//		if (almacen) {
//			sala="Almacén";
//		}
//		else {
//			System.out.println("Escriba aquí el piso y la sala dónde se encuentra la coleccion");
//			Scanner lector = new Scanner(System.in);
//			sala =lector.nextLine();
//			lector.close();
//		}
//		return sala;
//	}
	

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Ubicacion [piso=" + piso + ", sala=" + sala + "]";
	}
	
	
}
