package utilidades;

import java.util.Comparator;

import planeta.Planeta;

public class ComparadorPlanetas implements Comparator<Planeta> {

	@Override
	public int compare(Planeta o1, Planeta o2) {
		return (int) (o1.getDistancia() - o2.getDistancia());
	}
}
