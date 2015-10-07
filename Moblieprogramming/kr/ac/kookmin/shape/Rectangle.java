package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	
	private int w,h;
	
	public Rectangle(Point A,int a,int b)
	{
	super(A);
	w=a;
	h=b;
		
	}
	
	public int getHeight()
	{
		return h;
	}
	
	public int getWidth()
	{
		return w;
	}
	
	public Point getCenter()
	{
		return center;
	}
	
	public Rectangle getBounds() {
		return this;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
}