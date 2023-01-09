package clases;

public class Gimnasio {
	
	public static Robot lucha (Robot uno, Robot cero) {
		
		if (uno.ataque ==0 && cero.ataque == 0) {
			return null;
		}
		
		int turno = (int)(Math.random()*2);
		
		while (cero.vida >0 && uno.vida >0) {
		
			if (turno==0) {
				
				if ( cero.aleatorio() > uno.defensa) {
					uno.vida = uno.vida - cero.ataque;
				}	
				turno=1;
			}
			else if (turno==1) {
				
				if ( uno.aleatorio() > cero.defensa) {
					cero.vida = cero.vida - uno.ataque;
				}
				turno=0;	
			}	
		}
		
		if (cero.vida <=0) {
			return uno;
		}
		else {
			return cero;
		}
	}

}
