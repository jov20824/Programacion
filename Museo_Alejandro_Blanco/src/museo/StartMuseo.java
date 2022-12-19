package museo;

public class StartMuseo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ubicacion Luis = new Ubicacion();
		Luis.setPiso(-1);
		Luis.setSala(0);
		
		ObjArqueologico espadaMedieval = new ObjArqueologico();
		espadaMedieval.setAño(1000);
		espadaMedieval.setNombre("Espada del Cid Campeador");
		espadaMedieval.setMaterial("Hierro");
		espadaMedieval.setUbicacion(Luis);
		
		ObjArqueologico pechera = new ObjArqueologico();
		pechera.setAño(1003);
		pechera.setNombre("Pechera del Cid Campeador");
		pechera.setMaterial("Hierro");
		pechera.setUbicacion(Luis);
		
		ObjArqueologico yelmo = new ObjArqueologico();
		yelmo.setAño(1005);
		yelmo.setNombre("Yelmo del Cid Campeador");
		yelmo.setMaterial("Hierro");
		yelmo.setUbicacion(Luis);
		
		Coleccion coleccion1 = new Coleccion("Cid Campeador","Edad Media");
		coleccion1.setNumeroObjetos(3);
		coleccion1.setObjeto1(espadaMedieval);
		coleccion1.setObjeto2(pechera);
		coleccion1.setObjeto3(yelmo);
		
		Museo museo = new Museo();
		museo.setCiudad("Oviedo");
		museo.setNombre("Museo Arqueológico de Asturias");
		museo.setTamaño(300);
		museo.setColeccion1(coleccion1);
		
		System.out.println(museo);
	}

}
