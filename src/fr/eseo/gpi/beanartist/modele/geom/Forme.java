package fr.eseo.gpi.beanartist.modele.geom;

public abstract class Forme {
	public static final int HAUTEUR_PAR_DÉFAUT = 100;
	public static final int LARGEUR_PAR_DÉFAUT = 300;
	public static final Point POSITION_PAR_DÉFAUT = new Point(0,0);
	
	private int largeur;
	private int hauteur;
	private Point position;
	
	public Forme(Point position,int largeur,int hauteur){
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.position = position;
	}
	public Forme(){
		this(POSITION_PAR_DÉFAUT,HAUTEUR_PAR_DÉFAUT,LARGEUR_PAR_DÉFAUT);
	}
	public Forme(int x,int y, int hauteur, int largeur){
		this(new Point(x,y),largeur,hauteur);
	}
	public Forme(int largeur,int hauteur){
		this(POSITION_PAR_DÉFAUT,hauteur,largeur);
	}
	public Forme(Point position){
		this(position,HAUTEUR_PAR_DÉFAUT,LARGEUR_PAR_DÉFAUT);
	}
	
	public int getLargeur(){
		return this.largeur;
	}
	public int getHauteur(){
		return this.hauteur;
	}
	public Point getPosition(){
		return this.position;
	}
	public int getX(){
		return position.getX();
	}
	public int getY(){
		return position.getY();
	}
	public void setLargeur(int largeur){
		this.largeur = largeur;
	}
	public void setHauteur(int hauteur){
		this.hauteur = hauteur;
	}
	public void setPosition(Point position){
		this.position = position;
	}
	public void setX(int x){
		this.position.déplacerVers(x,this.getY());
	}
	public void setY(int y){
		this.position.déplacerVers(this.getX(),y);
	}
	
	public void déplacerVers(int x, int y){
		this.position.déplacerVers(x,y);
	}
	public void déplacerDe(int deltaX,int deltaY){
		this.position.déplacerDe(deltaX,deltaY);
	}
	
	public String toString(){
		return ""+this.getClass().getName()+" pos : ( " + this.getX()+
			" "+this.getY()+" dim : "+this.getLargeur()+" x "+
			this.getHauteur()+ " périmètre : "+this.périmètre()+" aire : "+
			this.aire();
	}
	public int getMaxX(){
		return getX()+getLargeur();
	}
	public int getMaxY(){
		return getY()+getHauteur();
	}
	public int getMinX(){
		return getX();
	}
	public int getMinY(){
		return getY();
	}
	
	public abstract double aire();
	public abstract double périmètre();
	
}
