package examen.ejercicio2;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.Figuras;
import examen.ejercicio1.Rectangulo;

public class Ejercicio2 {

	public static void main(String[] args) {
		Set <Figuras> set = new HashSet <Figuras>(); 
		Figuras circulo = new Circulo(Color.BLACK, 40, 32, true, "estado quieto", 10);
		Figuras rectangulo = new Rectangulo(Color.GREEN, 68, 23, false, "estado quieto", 9, 6);
		Figuras cuadrado = new Cuadrado(Color.RED, 97, 76, true, "estado quieto", 8);
	}

}
