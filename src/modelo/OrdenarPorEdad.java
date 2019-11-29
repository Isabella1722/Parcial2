package modelo;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Personaje> {


	@Override
	public int compare(Personaje p1, Personaje p2) {
		// TODO Auto-generated method stub
		return p1.getEdad()-p1.getEdad();
	}

}
