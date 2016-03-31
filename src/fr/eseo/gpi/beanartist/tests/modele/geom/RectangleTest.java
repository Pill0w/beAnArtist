package fr.eseo.gpi.beanartist.tests.modele.geom;
import fr.eseo.gpi.beanartist.modele.geom.Rectangle;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class RectangleTest{
	public static void main(String[] args) {
		Point p = new Point(3,5);
		Rectangle r1 = new Rectangle(p,5,10);
		System.out.println("largeur "+r1.getLargeur()+" hauteur "+
		r1.getHauteur()+" abscisse "+ r1.getX()+" ordonnée "+
		r1.getY());

		System.out.println("aire "+r1.aire()+" périmètre "+r1.périmètre());
		r1.déplacerVers(8,12);
		System.out.println("largeur "+r1.getLargeur()+" hauteur "+
		r1.getHauteur()+" abscisse "+ r1.getX()+" ordonnée "+
		r1.getY());
		r1.déplacerDe(2,-2);
		System.out.println("largeur "+r1.getLargeur()+" hauteur "+
		r1.getHauteur()+" abscisse "+ r1.getX()+" ordonnée "+
		r1.getY());

	}
}