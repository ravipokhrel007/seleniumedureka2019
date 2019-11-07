package ammark.Homework;

public class TemF2CUsing2Class {

	public static String mess = "Yippe! I calculated \" + \"FAHRENHEIT :  ";
	public static float toCelsius(float fahrenheit, String mes) 
	{
		float celsius = (fahrenheit -32) *5/9;
		
		System.out.println(  mess + fahrenheit +"------> TO --->" + "CELSIUS : " + celsius );
		return celsius;
		
	}
	}