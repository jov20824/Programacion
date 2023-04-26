package main;

import java.util.ArrayList;
import java.util.LinkedList;

import errores.PlanetaImposibleException;
import planeta.Planeta;
import planeta.SistemaSolar;
import utilidades.CalculosPlanetarios;
import utilidades.Read;

public class Start {

	public static void main(String[] args) {
//		SistemaSolar sistemaSolar = new SistemaSolar();
//
//		// si hacemos Planeta otroPlaneta= sistemaSolar.get(0); el planeta creado es una
//		// copia del anterior,
//		// si se cambia un atributo se cambia en los 2 objetos porque no tiene
//		// constructor copia.
//
//			Planeta tierra = new Planeta("Tierra");
//			
//			try {
//				tierra.setDistancia(1000d);
//			} catch (PlanetaImposibleException e) {
//				e.printStackTrace();
//			}
//			try {
//				sistemaSolar.añadirPlaneta(tierra);
//			} catch (Exception e){
//				e.printStackTrace();
//			}
//			try {
//				sistemaSolar.añadirPlaneta(tierra);
//			} catch (Exception e){
//				e.printStackTrace();
//			}
//		
//			Planeta mercurio = new Planeta("Mercurio");
//			
//			try {
//				mercurio.setDistancia(850d);
//			} catch (PlanetaImposibleException e) {
//				e.printStackTrace();
//			}
//			try {
//				sistemaSolar.añadirPlaneta(mercurio);
//			} catch (Exception e){
//				e.printStackTrace();
//			}
//			
//			Planeta venus = new Planeta("Venus");
//			
//			try {
//				venus.setDistancia(10d);
//			} catch (PlanetaImposibleException e) {
//				e.printStackTrace();
//			}
//			try {
//				sistemaSolar.añadirPlaneta(venus);
//			} catch (Exception e){
//				e.printStackTrace();
//			}
//			try {
//				sistemaSolar.añadirPlaneta(venus);
//			} catch (Exception e){
//				e.printStackTrace();
//			}
//
//			Planeta marte = new Planeta("Marte");
//			
//			try {
//				marte.setDistancia(1250d);
//			} catch (PlanetaImposibleException e) {
//				e.printStackTrace();
//			}
//			try {
//				sistemaSolar.añadirPlaneta(marte);
//			} catch (Exception e){
//				e.printStackTrace();
//			}
//			
//		sistemaSolar.recorrer();
//		System.out.println(CalculosPlanetarios.distanciaMediaSolar(sistemaSolar.getPlanetas()));
//		System.out.println(CalculosPlanetarios.distanciaMaxima(sistemaSolar.getPlanetas()));
//		System.out.println(sistemaSolar);
//		sistemaSolar.ordenar();
//		System.out.println(sistemaSolar);
		
		
		
		Read leer = new Read();
		SistemaSolar ss = new SistemaSolar();
		System.out.println(ss);
	}

}
