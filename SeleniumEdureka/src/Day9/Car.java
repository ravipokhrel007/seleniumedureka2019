package Day9;

public class Car extends Machine {
	
	public void restart() {
		System.out.println("Restart method from Car Class");
	}
	public void reset() {
		System.out.println("Reset method from Car Class");
	}
		@Override
		public void start()
		{
			System.out.println("I am in a start method of car class");
		}
		
	}
