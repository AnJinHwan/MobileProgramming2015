package kr.ac.kookmin.shape;

public abstract class Shape {
    protected Point center;
    	
    public Shape(Point A)
    {
    	center=A;
    }
    
    abstract Point getCenter();
    abstract Rectangle getBounds();
      abstract void draw(Graphics g);
      
      
}