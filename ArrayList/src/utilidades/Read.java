package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import planeta.Planeta;
import planeta.SistemaSolar;

public class Read {
	
	private final String FICHERO = "C:\\Users\\aleja\\Documents\\datos.txt";
	public void getDatos() {
		
		BufferedReader ficheroEntrada;
		
		try {
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
			String linea=ficheroEntrada.readLine();
			while (linea!= null) {
				System.out.println(linea);
				linea=ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
			
		}catch(IOException e){
			System.out.println("Problemas :" +e.getMessage());
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	
	
	public ArrayList<Planeta> crearPlaneta() {
		BufferedReader ficheroEntrada; 
		ArrayList<Planeta> ss = new ArrayList<Planeta>();
		
			try {
				ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
				String nombre=ficheroEntrada.readLine();
				
				while (nombre!= null) {
					
					String distancia=ficheroEntrada.readLine();

					String masa = ficheroEntrada.readLine();

					PlanetaCreator pc = new PlanetaCreator();
					Planeta planeta = pc.getPlaneta(nombre,distancia,masa);
					
					if (planeta!=null) ss.add(planeta);
					
					nombre =ficheroEntrada.readLine();
				}
				ficheroEntrada.close();
				
			}catch(IOException e){
				System.out.println("Problemas :" +e.getMessage());
			}catch(Exception e) {
				e.printStackTrace();
			}
		return ss;
	}
}
