package Day10;

public class DemoMultipleBrowserTesting {

	public static void main(String[] args) {
		MultipleBrowserTesting mbt = new MultipleBrowserTesting ();
		try {
			mbt.invokeBrowser("chrome");
			mbt.invokeBrowser("firefox");
			mbt.invokeBrowser("Safari");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
