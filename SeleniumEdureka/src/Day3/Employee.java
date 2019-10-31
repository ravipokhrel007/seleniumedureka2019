package Day3;

public class Employee 
{
	int salary;
	int bonus;
	
void calculateSalary()
{
	int totalSalary = salary + bonus;
	
	System.out.println("Total Salary: " + totalSalary);
}
	int calculateSalary1()
	{
		int totalSalary = salary + bonus;
		
		return totalSalary;
	}

	int calculateSalary2(int sal, int bon)
	{
		int totalSalary = sal + bon;
		
		return totalSalary;
	}
	
	int calculateSalary3(int salary, int bonus)
	{
		int totalSalary = this.salary + this.bonus;
		//this means we are using value at class level & NOT at arguments level
		
		return totalSalary;
	}
}
