package fr.eseo.gpi.beanartist.modele.geom;

public class Ellipse extends Forme {
	
	public Ellipse(Point position,int largeur,int hauteur){
		this.setLargeur(largeur);
		this.setHauteur(hauteur);
		this.setPosition(position);
	}
	public Ellipse(int largeur,int hauteur){
		this(Forme.POSITION_PAR_DÉFAUT,hauteur,largeur);
	}
	public Ellipse(Point position){
		this(position,Forme.HAUTEUR_PAR_DÉFAUT,Forme.LARGEUR_PAR_DÉFAUT);
	}
	public Ellipse(){
		this(Forme.POSITION_PAR_DÉFAUT,Forme.HAUTEUR_PAR_DÉFAUT,Forme.LARGEUR_PAR_DÉFAUT);
	}
	public Ellipse(int x, int y, int hauteur, int largeur){
		this(new Point(x,y),largeur,hauteur);
	}

	public double aire(){
		return (3.14*this.getLargeur()*this.getHauteur()/4);
	}

	public double périmètre(){
		return (3.14*Math.sqrt((this.getLargeur()*this.getLargeur() + this.getHauteur()*this.getHauteur())/2));
	}

}
