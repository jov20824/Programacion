package utilidades;

import planeta.Planeta;

public class PlanetaCreator {

	public Planeta getPlaneta(String nombre, String distancia, String masa) {
		
		Planeta planeta = new Planeta(nombre);
		
		try {
			planeta.setDistancia(Double.parseDouble(distancia));
			planeta.setMasa(Double.parseDouble(masa));
		}catch (Exception e) {
			e.printStackTrace();
			planeta = null;
		}
		
		return planeta;
	}

}
