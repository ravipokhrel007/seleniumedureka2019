package Day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//1st - Declaring a variable. Here Saurab varaibale is of class Employee
		Employee saurabh;
		
		//2nd - Instantiation and 
		//Instantiation happen with 'new' keyword. Process to reserve the memory allocation and location.
		
		//3rd - Initialization.
		//Initialization happen when 'new' is used with default values - This is a process to give the default value. e.g. Employee().
		saurabh = new Employee();
		
		
		saurabh.salary = 70000;
		saurabh.bonus = 8000;
		//'.' operator is used to access the elements of the object (e.g. saurabh)
		
		saurabh.calculateSalary();
		
		//-------------------------
		Employee jacob =new Employee();

		
		jacob.salary = 170000;
		jacob.bonus = 18000;
		jacob.calculateSalary();
	}

}
