package fr.eseo.gpi.beanartist.modele.geom;

public class Point{
	int x;
	int y;

	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public Point(){
		this(0,0);
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.x=y;
	}
	public void déplacerVers(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void déplacerDe(int deltaX, int deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}
	public String toString(){
		return "[Point] x : " + getX() +" y : " + getY();
	}
}