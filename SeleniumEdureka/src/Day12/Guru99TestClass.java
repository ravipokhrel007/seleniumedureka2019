package Day12;

public class Guru99TestClass {
	
	public void invokeBrowser() {
		System.out.println("Invoke the Browser");

}
	public void login() throws ArrayIndexOutOfBoundsException, Exception{
		
		
		int[] arr= new int[5];
	
		
				arr[0] = 10;
				arr[1] = 13;
				arr[2] = 23;
				arr[3] = 78;
				arr[4] = 90;
				
				for(int i=0; i <=5; i++){
					System.out.println(arr[i]);
				}

		
		System.out.println("Login to the app");
}
	public void addUser() {
		System.out.println("Add User");
}
	public void logout() {
		System.out.println("Add Logout from the app");
}
	public void closeBrowser() {
		System.out.println("Close the Browser");
}
}
