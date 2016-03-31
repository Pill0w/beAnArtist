package fr.eseo.gpi.beanartist.modele.geom;

public class Carré extends Rectangle {
	public Carré (Point p,int largeur){
		super(p,largeur,largeur);
	}
	public Carré (int largeur){
		this(Rectangle.POSITION_PAR_DÉFAUT,largeur);
	}
	public Carré (Point p){
		this(p,Rectangle.LARGEUR_PAR_DÉFAUT);
	}
	public Carré(int x, int y, int largeur){
		this(new Point(x,y),largeur);
	}
	public Carré(){
		this(Rectangle.POSITION_PAR_DÉFAUT,Rectangle.LARGEUR_PAR_DÉFAUT);
	}
	
	public void setLargeur(int largeur){
		super.setLargeur(largeur);
		super.setHauteur(largeur);
	}
	public void setHauteur(int hauteur){
		super.setHauteur(hauteur);
		super.setLargeur(hauteur);
	}
}
