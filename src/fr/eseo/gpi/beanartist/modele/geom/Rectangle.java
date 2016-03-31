package fr.eseo.gpi.beanartist.modele.geom;

public class Rectangle extends Forme{
	
	public Rectangle(Point position,int largeur,int hauteur){
		this.setLargeur(largeur);
		this.setHauteur(hauteur);
		this.setPosition(position);
	}
	public Rectangle(int largeur,int hauteur){
		this(Forme.POSITION_PAR_DÉFAUT,hauteur,largeur);
	}
	public Rectangle(Point position){
		this(position,Forme.HAUTEUR_PAR_DÉFAUT,Forme.LARGEUR_PAR_DÉFAUT);
	}
	public Rectangle(){
		this(Forme.POSITION_PAR_DÉFAUT,Forme.HAUTEUR_PAR_DÉFAUT,Forme.LARGEUR_PAR_DÉFAUT);
	}
	public Rectangle(int x,int y,int hauteur, int largeur){
		this(new Point(x,y),largeur,hauteur);
	}

	public double aire(){
		return this.getHauteur()*this.getLargeur();
	}

	public double périmètre(){
		return 2*(this.getHauteur()+this.getLargeur());
	}

	
}