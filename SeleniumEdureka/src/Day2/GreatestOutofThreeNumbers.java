package Day2;

public class GreatestOutofThreeNumbers 
{
	public static void main(String[] args) 
	{
		int a, b, c;
		a=809;
		b=89;
		c=109;
		
		
		if((a>b) && (a>c))
		{
			System.out.println("A is greatest");
		}
		else if((b>a) && (b>a))
		{
			System.out.println("B is greatest");
	}
		else if((c>a) && (c>b))
		{
			System.out.println("C is greatest");
		}
		else if((a==b) && (a>c))
		{
			System.out.println("A and B is greatest than C");
		}
		else if((b==c) && (b>a))
		{
			System.out.println("B and C is greatest than A");
		}
		else if((a==c) && (a>b))
		{
			System.out.println("A and C is greatest than B");
		}
		
		else
		{
			System.out.println("All are equal");
		}
	
	}
}
