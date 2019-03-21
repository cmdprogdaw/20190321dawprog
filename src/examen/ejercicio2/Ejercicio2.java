package examen.ejercicio2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.ComparatorArea;
import examen.ejercicio1.ComparatorRellenoPerimetro;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.Figuras;
import examen.ejercicio1.Rectangulo;

public class Ejercicio2 {

	public static void main(String[] args) {
		Set <Figuras> set = new HashSet <Figuras>(); 
		set.add(new Circulo(Color.BLACK, 40, 32, true, "estado quieto", 10));
		set.add(new Rectangulo(Color.GREEN, 68, 23, false, "estado quieto", 9, 6));
		set.add(new Cuadrado(Color.RED, 97, 76, true, "estado quieto", 8)); 
		
		ArrayList<Figuras> lista = new ArrayList<>(set);
		
		mostrarLista(lista);
		Collections.sort(lista, Collections.reverseOrder());
		mostrarLista(lista);
		Collections.sort(lista, new ComparatorArea());
		mostrarLista(lista);
		Collections.sort(lista, new ComparatorRellenoPerimetro());
		mostrarLista(lista);
		Collections.sort(lista, Collections.reverseOrder(new ComparatorArea()));
		mostrarLista(lista);
		Collections.sort(lista, Collections.reverseOrder(new ComparatorRellenoPerimetro()));
		mostrarLista(lista);
	}

	public static void mostrarLista(ArrayList<Figuras> lista) {
		Iterator<Figuras> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
