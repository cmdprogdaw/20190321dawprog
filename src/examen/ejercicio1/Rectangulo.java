package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends Figuras{
	private double base;
	private double altura;
	
	public Rectangulo(Color color, double x, double y, boolean relleno, String detalles, double base, double altura) {
		super(color, x, y, relleno, detalles);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return base * altura;
	}
	
	@Override
	public double getPerimetro() {
		return 2 * (base + altura);
	}

	@Override
	public String toString() {
		return super.toString() +  "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
}
