package examen.ejercicio1;

import java.awt.Color;

public abstract class Figuras implements Comparable<Figuras> {
	private Color color;
	private double x;
	private double y;
	private boolean relleno;
	private String detalles;
	
	
	public Figuras(Color color, double x, double y, boolean rellenas, String detalles) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.relleno = rellenas;
		this.detalles = detalles;
	}


	public Figuras(double posicion, double x, double y, boolean rellenas, String detalles) {
		color = Color.RED;
		this.x = x;
		this.y = y;
		this.relleno = rellenas;
		this.detalles = detalles;
	}


	public Figuras(Color color, double x, double y, String detalles) {
		relleno = true;
		this.color = color;
		this.x = x;
		this.y = y;
		this.detalles = detalles;
	}


	public Figuras(double x, double y, String detalles) {
		color = Color.RED;
		relleno = true;
		this.x = x;
		this.y = y;
		this.detalles = detalles;
	}



	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public boolean isRelleno() {
		return relleno;
	}


	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	
	public String getDetalles() {
		return detalles;
	}


	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();


	@Override
	public String toString() {
		return "Figuras [color=" + color + ", x=" + x + ", y=" + y + ", relleno=" + relleno + ", detalles=" + detalles
				+ "]";
	}
	
	@Override
	public int compareTo(Figuras e) {
		if (getArea() < e.getArea())
			return -1;
		else if (getArea() > e.getArea())
			return 1;
		return 0;
	}
}
