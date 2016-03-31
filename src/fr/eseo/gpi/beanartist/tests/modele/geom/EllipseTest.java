package fr.eseo.gpi.beanartist.tests.modele.geom;

import fr.eseo.gpi.beanartist.modele.geom.Ellipse;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class EllipseTest {
	public static void main(String[] args) {
		Point p = new Point (12,25);
		Ellipse e1 = new Ellipse(p,23,100);
		Ellipse e2 = new Ellipse(8,12);
		Ellipse e3 = new Ellipse();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
}
