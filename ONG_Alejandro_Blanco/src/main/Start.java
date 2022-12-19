package main;

import clases.ONG;
import clases.Proyecto;
import clases.Sede;

public class Start {

	public static void main(String[] args) {
		

		
		Proyecto pozos = new Proyecto();
		pozos.setId(1);
		pozos.setPais("Argelia");
		pozos.setPoblaciones("Aldea Fritzi y aldea Humbaba");
		pozos.setImporteInversion(300000);
		
		Proyecto escolarizacion = new Proyecto();
		escolarizacion.setId(2);
		escolarizacion.setPais("Somalia");
		escolarizacion.setPoblaciones("Ciudad de Somalia");
		escolarizacion.setImporteInversion(500000);
		
		Proyecto vacunacion = new Proyecto();
		vacunacion.setId(3);
		vacunacion.setPais("Somalia");
		vacunacion.setPoblaciones("Ciudad de Somalia");
		vacunacion.setImporteInversion(650000);
		
		Sede somalia = new Sede();
		somalia.setPais("Somalia");
		somalia.setCiudad("Ciudad de Somalia");
		somalia.setDireccion("Plza. Universidad, 6");
		somalia.setTelefonoReferencia(650000000);
		somalia.setNombreDirector("Mario Bajo Lopez");
		somalia.setProyecto1(escolarizacion);
		somalia.setProyecto2(vacunacion);
		
		Sede argelia = new Sede();
		argelia.setPais("Argelia");
		argelia.setCiudad("Ciudad de Argelia");
		argelia.setDireccion("Plza. Argelia, 9");
		argelia.setTelefonoReferencia(615060504);
		argelia.setNombreDirector("Pablo Lopez Jorreto");
		argelia.setProyecto1(pozos);
		
		ONG marcosSinFronteras = new ONG();
		marcosSinFronteras.setSede1(argelia);
		marcosSinFronteras.setSede2(somalia);
		
		System.out.println(marcosSinFronteras);
	}

}
