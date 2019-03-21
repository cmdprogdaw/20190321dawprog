package examen.ejercicio1;

import java.util.Comparator;

public class ComparatorRellenoPerimetro implements Comparator<Figuras>{

	@Override
	public int compare(Figuras f1, Figuras f2) {
		if (f1.isRelleno() && !f2.isRelleno())
			return -1;
		else if (!f1.isRelleno() && f2.isRelleno())
			return 1;
		else if (f1.getPerimetro() < f2.getPerimetro())
			return -1;
		else
			return 1;
	}

}
