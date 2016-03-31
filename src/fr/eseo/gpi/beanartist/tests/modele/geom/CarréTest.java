package fr.eseo.gpi.beanartist.tests.modele.geom;

import fr.eseo.gpi.beanartist.modele.geom.Carré;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class CarréTest {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		Carré c1 = new Carré(p,10);
		Carré c2 = new Carré(10);
		Carré c3 = new Carré();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c1.setLargeur(15);
		c2.setHauteur(25);

		System.out.println(c1);
		System.out.println(c2);
		
	}
}
