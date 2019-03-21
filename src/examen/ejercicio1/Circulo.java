package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends Figuras{
	private double radio;
	
	public Circulo(Color color, double x, double y, boolean relleno, String detalles, double radio) {
		super(color, x, y, relleno, detalles);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * (radio * radio); 
	}
	
	@Override
	public double getPerimetro() {
		return 2 * Math.PI * radio * radio;
	}

	@Override
	public String toString() {
		return super.toString() + "Circulo [radio=" + radio + "]";
	}
	
	
}
