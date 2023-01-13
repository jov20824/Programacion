package clases;

import java.util.Scanner;

public class Lucha {
	public static Pokemon lucha(Pokemon luchador1 , Pokemon luchador2) {
		
		Scanner lector = new Scanner(System.in);
		
		boolean turno = true;
		
		if (luchador1.velocidad>luchador2.velocidad) {
			turno=true;
			
		}
		if (luchador2.velocidad>luchador1.velocidad) {
			turno=false;
		}
		
		while (luchador1.vida>0 && luchador2.vida>0) {
			String primero = "";
			if (turno) {
				primero=luchador1.nombre;
			}
			else {
				primero = luchador2.nombre;
			}
			System.out.println("Seleccione su ataque (turno de "+primero+")");
			int ataque =lector.nextInt();
			
			if (ataque == 1) {
				
					if (luchador1.a1.nombre=="llamarada" && turno) {
						if (luchador2.tipo=="planta") {
							luchador2.vida -= ((luchador1.a1.danio+luchador1.danio)/2)*1.5;
						}
						else {
							luchador2.vida -= (luchador1.a1.danio+luchador1.danio)/2;
						}
						turno = false;
					}
				
					else if (luchador1.a1.nombre=="hidrobomba" && turno) {
						if (luchador2.tipo=="fuego") {
							luchador2.vida -= ((luchador1.a1.danio+luchador1.danio)/2)*1.5;
						}
						else {
							luchador2.vida -= (luchador1.a1.danio+luchador1.danio)/2;
						}
						turno = false;
					}
					
					else if (luchador1.a1.nombre=="rayo solar" && turno) {
						if (luchador2.tipo=="agua") {
							luchador2.vida -= ((luchador1.a1.danio+luchador1.danio)/2)*1.5;
						}
						else {
							luchador2.vida -= (luchador1.a1.danio+luchador1.danio)/2;
						}
						turno = false;
					}
					else if (luchador2.a1.nombre=="llamarada" && !turno) {
						if (luchador1.tipo=="planta") {
							luchador1.vida -= ((luchador2.a1.danio+luchador2.danio)/2)*1.5;
						}
						else {
							luchador1.vida -= (luchador2.a1.danio+luchador2.danio)/2;
						}
						turno = true;
					}
				
					else if (luchador2.a1.nombre=="hidrobomba" && !turno) {
						if (luchador1.tipo=="fuego") {
							luchador1.vida -= ((luchador2.a1.danio+luchador2.danio)/2)*1.5;
						}
						else {
							luchador1.vida -= (luchador2.a1.danio+luchador2.danio)/2;
						}
						turno = true;
					}
					
					else if (luchador2.a1.nombre=="rayo solar" && !turno) {
						if (luchador1.tipo=="agua") {
							luchador1.vida -= ((luchador2.a1.danio+luchador2.danio)/2)*1.5;
						}
						else {
							luchador1.vida -= (luchador1.a1.danio+luchador1.danio)/2;
						}
						turno = true;
					}
					
			}
			if (ataque==2) {
				
				if (luchador1.a2.nombre=="lanzallamas" && turno) {
					if (luchador2.tipo=="planta") {
						luchador2.vida -= ((luchador1.a2.danio+luchador1.danio)/2)*1.5;
					}
					else {
						luchador2.vida -= (luchador1.a2.danio+luchador1.danio)/2;
					}
					turno = false;
				}
				else if (luchador1.a2.nombre=="pistola agua" && turno) {
					if (luchador2.tipo=="fuego") {
						luchador2.vida -= ((luchador1.a2.danio+luchador1.danio)/2)*1.5;
					}
					else {
						luchador2.vida -= (luchador1.a2.danio+luchador1.danio)/2;
					}
					turno = false;
				}
				else if (luchador1.a2.nombre=="latigo cepa" && turno) {
					if (luchador2.tipo=="agua") {
						luchador2.vida -= ((luchador1.a2.danio+luchador1.danio)/2)*1.5;
					}
					else {
						luchador2.vida -= (luchador1.a2.danio+luchador1.danio)/2;
					}
					turno = false;
				}
				else if (luchador2.a2.nombre=="lanzallamas" && !turno) {
					if (luchador1.tipo=="planta") {
						luchador1.vida -= ((luchador2.a2.danio+luchador2.danio)/2)*1.5;
					}
					else {
						luchador1.vida -= (luchador2.a2.danio+luchador2.danio)/2;
					}
					turno = false;
				}
				else if (luchador2.a2.nombre=="pistola agua" && !turno) {
						if (luchador1.tipo=="fuego") {
							luchador1.vida -= ((luchador2.a2.danio+luchador2.danio)/2)*1.5;
						}
						else {
							luchador1.vida -= (luchador2.a2.danio+luchador2.danio)/2;
						}
						turno = false;
					}
				else if (luchador2.a2.nombre=="latigo cepa" && !turno) {
						if (luchador1.tipo=="agua") {
							luchador1.vida -= ((luchador2.a2.danio+luchador2.danio)/2)*1.5;
						}
						else {
							luchador1.vida -= (luchador2.a2.danio+luchador2.danio)/2;
						}
						turno = false;
					}
				}
			if (ataque==3) {

				if (turno) {
					luchador1.vida+=luchador1.a3.danio;
					turno=false;
				}
				else if (!turno) {
					luchador2.vida+=luchador2.a2.danio;
					turno=true;
				}
				
			}
		System.out.println();
		if (turno&&ataque!=3) {
			System.out.println("La vida de "+luchador1.nombre+": "+luchador1.vida);
		}
		else if (!turno&&ataque!=3) {
			System.out.println("La vida de "+luchador2.nombre+": "+luchador2.vida);
		}
		else if (turno&&ataque==3) {
			System.out.println("La vida de "+luchador2.nombre+": "+luchador2.vida);
		}
		else if (!turno&&ataque==3) {
			System.out.println("La vida de "+luchador1.nombre+": "+luchador1.vida);
		}
		}
		
		lector.close();
		if (luchador1.vida>0) {
			return luchador1;
		}
		if (luchador2.vida>0) {
			return luchador2;
		}
		else {
			return null;
		}
	}
}
