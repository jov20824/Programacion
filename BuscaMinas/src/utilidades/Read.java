package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import objects.Mina;

public class Read {

	private final static String FICHERO = "C:\\Users\\aleja\\Documents\\minas.txt";
	
	
	public static ArrayList<Mina> recogerPosiciones(){
		BufferedReader ficheroEntrada; 
		ArrayList<Mina> listaMinas = new ArrayList<Mina>();
		
		try {
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
			String linea=ficheroEntrada.readLine();
			
			while (linea!= null) {
				MinaCreator mc = new MinaCreator();
				Mina mina = mc.crearMina(linea);
				
				if(mina!=null) {
					listaMinas.add(mina);
				}
				linea =ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaMinas;
	}
		
	
}
