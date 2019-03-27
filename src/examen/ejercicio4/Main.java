package examen.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		Scanner scanner;
		Map<String, Integer> map = new HashMap<>();
		String operacion;
		String nombre;
		String respuesta;
		int n;
		int contacto = 0;
		boolean fin = false;
		String token;
		
		while (!fin) {
			scanner = new Scanner(in.nextLine());
			int estado = 0;
			while (estado != 5) {
				switch (estado) {
				case 0:
					try {
						token = scanner.skip("").match().group();
						
					} catch (NoSuchElementException e) {
						
					}
					
					break;
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				}
			}
		}
	}
}
/*
		do {
			do {
				System.out.println("Introduce la operacion que quieras");
				operacion = in.nextLine();
				Pattern p = Pattern.compile("\\*sbuscar\\s*|\\s*fin\\s$|\\s*(\\w+\\s*)+");
				Matcher m = p.matcher(operacion);
				if (!m.matches()) {
					throw new Exception("La operacion no es posible");
				} else if (m.matches()) {
					if (m.equals("\\*sagregar\\s*"))
						if (contacto == 0) {
							System.out.print("Introduce el nombre de tu primer contacto: ");
							nombre = in.nextLine();
							System.out.print("Introduzca su numero: ");
							n = in.nextInt();
							map.put(nombre, n);
							System.out.println(map);
						} else {
							System.out.println("Introduce un nuevo contacto: ");
							nombre = in.nextLine();
							System.out.print("Introduzca su numero: ");
							n = in.nextInt();
							if (map.containsKey(nombre)) {
								map.remove(n);
								map.put(nombre, n);
							} else
								map.put(nombre, n);

							map.put(nombre, n);
							System.out.println(map);
						}
				}

			} while (m.matches());
			System.out.println("¿Quiere realizar otra operacion?");
			respuesta = in.next();
		} while (!respuesta.equalsIgnoreCase("\\s*fin\\s$"));
	}
}
   \\*sbuscar\\s*|\\s*fin\\s$|\\s*(\\w+\\s*)+                        string.trim*/