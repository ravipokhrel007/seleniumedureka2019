package Day7;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonProject ap = new AmazonProject();
		ap.invokeBrowser();
		ap.searchProduct("Apple Watch", "Watches");
		
		//String nthProduct = ap.getNthProduct(7);
		//System.out.println(nthProduct);
		
		ap.printAllProducts();
		
		ap.printAllProductsViaJavaScript();
	}

}
