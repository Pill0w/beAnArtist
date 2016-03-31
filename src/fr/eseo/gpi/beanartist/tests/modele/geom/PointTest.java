package fr.eseo.gpi.beanartist.tests.modele.geom;
import fr.eseo.gpi.beanartist.modele.geom.Point;

class PointTest{
	public static void main(String[] args) {
		Point p1 = new Point(3,5);
		Point p2 = new Point();

		System.out.println("(3,5) le point 1 est en : " + p1.getX() + p1.getY());
		System.out.println("(0,0) le point 2 est en : " + p2.getX() + p2.getY());
		p2.déplacerVers(12,15);
		p1.déplacerDe(-2,3);
		System.out.println("(1,8) le point 1 est en : " + p1.getX() + p1.getY());
		System.out.println("(12,15) le point 2 est en : " + p2.getX() + p2.getY());

	}

}