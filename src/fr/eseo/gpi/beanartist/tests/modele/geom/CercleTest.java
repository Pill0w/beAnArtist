package fr.eseo.gpi.beanartist.tests.modele.geom;

import fr.eseo.gpi.beanartist.modele.geom.Cercle;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class CercleTest {
	public static void main(String[] args) {
		Point p = new Point (12,25);
		Cercle c1 = new Cercle(p,100);
		Cercle c2 = new Cercle(8);
		Cercle c3 = new Cercle();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
	
}
