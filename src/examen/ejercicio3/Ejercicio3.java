package examen.ejercicio3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el numero de compuestos quimicos");
		int nºcompuestos = in.nextInt();
		String compuestos;
		
		while (nºcompuestos > 0) {
			System.out.println("Escribe los compuestos: ");
			compuestos = in.nextLine();
			TreeSet<String> treeSet = new TreeSet<>();
			treeSet.add(compuestos);
			for (int i = 0; i < compuestos.length(); i++) {
				
			}
		}
	}

	static void mostrarColeccion(Collection c) {
		Iterator<String> i = c.iterator();
		while (i.hasNext()) {
			String compuestos = i.next();
			System.out.print(compuestos);
		}
		System.out.println();
	}
}
