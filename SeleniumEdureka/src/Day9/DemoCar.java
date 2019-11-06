package Day9;

public class DemoCar {

	public static void main(String[] args) {
		Machine mach = new Machine();
		mach.start();
		mach.stop();
		System.out.println("--------------------------------------");
		
		Car crs = new Car();
		crs.restart();
		crs.reset();
		System.out.println("--------------------------------------");
		
		
		crs.start();
		crs.stop();
		crs.reset();
		crs.restart();
		System.out.println("--------------------------------------");
		
		Machine ford = new Car();
		ford.start();
		ford.stop();
	

	}

}
