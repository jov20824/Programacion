package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import product.Producto;
import product.Stock;
import utilities.MergeStock;
import utilities.ProductosIncompatiblesException;
import utilities.Read;
import utilities.Write;

public class Start {

	public static void main(String[] args) {
		
		Stock s1 = new Stock(Read.FICHERO1);
		System.out.println(s1);
		Stock s2 = new Stock(Read.FICHERO2);
		System.out.println(s2);
		Write escribir = new Write();
		
		Stock s3 = escribir.escribirFichero(s1.getStock(), s2.getStock());
		System.out.println(s3);
		
	}

}
