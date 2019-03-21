package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends Figuras{
	private double lado;

	public Cuadrado(Color color, double x, double y, boolean relleno, String detalles, double lado) {
		super(color, x, y, relleno, detalles);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}
	
	@Override
	public double getPerimetro() {
		return 4 * lado;
	}

	@Override
	public String toString() {
		return super.toString() + "Cuadrado [lado=" + lado + "]";
	}
	
}
