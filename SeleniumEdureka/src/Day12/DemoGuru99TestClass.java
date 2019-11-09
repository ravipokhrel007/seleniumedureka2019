package Day12;

public class DemoGuru99TestClass {

	public static void main(String[] args) {
		Guru99TestClass guru = new Guru99TestClass();
		
		try {
			guru.invokeBrowser();
			guru.login();
			guru.addUser();
			guru.logout();
			guru.closeBrowser();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		
	}finally {
		guru.closeBrowser();
	}
	}

}
