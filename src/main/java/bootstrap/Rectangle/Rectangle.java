package bootstrap.Rectangle;
import bootstrap.IsShape;
public class Rectangle implements IsShape 
{
	int sideLength, sideBreadth;
	public Rectangle(int sideLength, int sideBreadth)
	{
		this.sideLength = sideLength;
		this.sideBreadth = sideBreadth;
	}
	public double getArea()
	{
		return sideLength * sideBreadth;
	}
	public double getPerimeter()
	{
		return 2 * (sideLength + sideBreadth);
	}
}