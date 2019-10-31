package Day3;


public class DemoEmployee {

		int salary;
		int bonus;
		//this is class level variable

		void calculateSalary()
		{
			int totalSalary = salary + bonus;
			//totalSalary is local variable and can be used only inside this method only
			
			System.out.println("Total Salary: " + totalSalary);
		}
		
		int calculateSalary1()
		{
			int totalSalary = salary + bonus;
			
			return totalSalary;
		}

		int calculateSalary2(int sal, int bon)
		//argument level variables. These are local variable and can be used inside this method only
		
		{
			
			int totalSalary = salary + bonus;
			
			return totalSalary;
		}


}
