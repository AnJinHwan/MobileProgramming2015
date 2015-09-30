package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	
	private int w,h;
	
	public Ellipse(Point A,int a,int b)
	{
		super(A);
		w=a;
		h=b;
		
	}
	
	public int getSemiMajorAxis()
	{
		return(w>h? w:h);
	}
	
	public int getSemiMinorAxis()
	{
		
		return(w>h? h:w);
		
	}
		
		public Point getCenter()
		{
			return center;
		}

    public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}
}