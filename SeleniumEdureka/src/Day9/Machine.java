package Day9;

public class Machine {
int engineSize;

public void start() {
	System.out.println("Machine constructor");
}
public void stop () {
	System.out.println("Stop method of machine");
}
}
//super() keyword is used to call explicit constructor

//protected variables are available outside the class only by inheritance... Default is NOT available at all.