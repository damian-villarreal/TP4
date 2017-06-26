package ar.edu.unlam.pb2.BarDeLosNoHomeros;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		return c1.getEdad().compareTo(c2.getEdad());
	}

}
