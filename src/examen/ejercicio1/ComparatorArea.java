package examen.ejercicio1;

import java.util.Comparator;

public class ComparatorArea implements Comparator<Figuras> {

	@Override
	public int compare(Figuras f1, Figuras f2) {
		if (f1.getArea() < f2.getArea())
			return -1;
		else if (f1.getArea() > f2.getArea())
			return 1;
		return 0;
	}

}
