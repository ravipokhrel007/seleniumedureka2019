package Day8;

public class DemoShape {

	public static void main(String[] args) {
		Shape circle = new Shape();
			System.out.println("Area of Circle : " + circle.calculateAreas(10.5));
			
			Shape square = new Shape();
			System.out.println("Area of Square : " + square.calculateAreas(10));
			
			Shape rectan = new Shape();
			System.out.println("Area of Rectangle : " + rectan.calculateAreas(10, 5));

	}

}
