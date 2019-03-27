package examen.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		String operacion;
		String nombre;
		String respuesta;
		int n;
		int contacto = 0;
		
		
		
		do {
			do {
				System.out.println("Introduce la operacion que quieras");
				operacion = in.nextLine();
				Pattern p = Pattern.compile("a*b");
				Matcher m = p.matcher("aaaaab");
				boolean b = m.matches();
				boolean bb = Pattern.matches("a*b", "aaaaab");
				if (operacion.equalsIgnoreCase("agregar"))
					throw new Exception("La operacion no es posible");
			} while (operacion.equalsIgnoreCase("buscar") && operacion.equalsIgnoreCase("agregar"));
			if (operacion.equalsIgnoreCase("agregar")) {
				if (contacto == 0) {
					System.out.print("Introduce el nombre de tu primer contacto: ");
					nombre = in.nextLine();
					System.out.print("Introduzca su numero: ");
					n = in.nextInt();
					map.put(nombre, n);
					System.out.println(map);
				}else {
					System.out.println("Introduce un nuevo contacto: ");
					nombre = in.nextLine();
					System.out.print("Introduzca su numero: ");
					n = in.nextInt();
					if (map.containsKey(nombre)) {
						map.remove(n);
						map.put(nombre, n);
					}else
						map.put(nombre, n);
					
					map.put(nombre, n);
					System.out.println(map);
				}
			}
			System.out.println("¿Quiere realizar otra operacion?");
			respuesta = in.next();
		}while(!respuesta.equalsIgnoreCase("fin"));
		
	}
}
