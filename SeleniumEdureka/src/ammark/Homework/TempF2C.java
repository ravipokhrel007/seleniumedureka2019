package ammark.Homework;

public class TempF2C {

	public static void main(String[] args) 
	{
		TempF2C temp = new TempF2C();
		
		float fahrenheit = 110.00f;
		float celsius = temp.toCelsius(fahrenheit);
				System.out.println( "Yippe! I calculated " + "FAHRENHEIT :  "  + fahrenheit +"------> TO --->" + "CELSIUS : " + celsius );
	}
	
	
	public static float toCelsius(float fahrenheit) 
	{
		float celsius = (fahrenheit -32) *5/9;
		
		return celsius;


	}
	
	/*public static float toFahrenheit(float celsius) 
	{
		float fahrenheit = 9 * (celsius/5) +32;
		
		return fahrenheit;
	}

*/
}
