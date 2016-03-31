package fr.eseo.gpi.beanartist.modele.geom;

public class Cercle extends Ellipse {
	public Cercle (Point p,int largeur){
		super(p,largeur,largeur);
	}
	public Cercle (int largeur){
		this(Rectangle.POSITION_PAR_DÉFAUT,largeur);
	}
	public Cercle (Point p){
		this(p,Rectangle.LARGEUR_PAR_DÉFAUT);
	}
	public Cercle(){
		this(Rectangle.POSITION_PAR_DÉFAUT,Rectangle.LARGEUR_PAR_DÉFAUT);
	}
	public Cercle(int x,int y,int largeur){
		this(new Point(x,y),largeur);
	}
	
	public void setLargeur(int largeur){
		super.setLargeur(largeur);
		super.setHauteur(largeur);
	}
	public void setHauteur(int hauteur){
		super.setHauteur(hauteur);
		super.setLargeur(hauteur);
	}
	public double aire(){
		return (3.14*this.getLargeur()*this.getLargeur()/4);
	}
	public double périmètre(){
		return (3.14*this.getLargeur());
	}
}
