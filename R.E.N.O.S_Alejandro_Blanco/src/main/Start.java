package main;

import clases.Robot;

public class Start {

	public static void main(String[] args) {
		
		Robot marcos = new Robot();
		
		marcos.setNombre("Marcos");
		marcos.setVida(50);
		marcos.setAtaque(15);
		marcos.setDefensa(20);
		
		System.out.println(marcos);
		
		
		Robot juanjo = new Robot();
		
		juanjo.setNombre("Juanjo");
		juanjo.setVida(75);
		juanjo.setAtaque(20);
		juanjo.setDefensa(30);
		
		System.out.println(juanjo);
	}

}
