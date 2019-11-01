package Day5;

public class DemoGuru99Project 
{

	public static void main(String[] args) {
		GURU99Project guru = new GURU99Project();
				
					guru.invokeBrowser();
					
					guru.login("mngr231023", "Eparedu");
					
					guru.addCustomer();
					
					String customerId = guru.getCustomerId();
					System.out.println("Customer ID is :" + customerId);
					
					guru.addAccount(customerId);
					
					//guru.closeBrowser();
				}

	

}
