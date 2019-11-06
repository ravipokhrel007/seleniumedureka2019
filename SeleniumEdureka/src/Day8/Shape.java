package Day8;

public class Shape {
	
	public double calculateAreas (int len, int wid)
	{
		double area;
		area = len * wid;
		return area;
	}
	public double calculateAreas (int side)
	{
		double area;
		area = side * side;
		return area;
	}
	public double calculateAreas(double radius)
	{
		double area;
		area = Math.PI  * radius * radius;
		return area;
	}
}
