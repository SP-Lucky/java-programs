
public class Staticmethod 
{
	static String product ="shiva";
	static int a=12;
	static int b=234;
	static double c=0.22;
	
	static void details()
	{
		System.out.println("Given product name :" +product);
		System.out.println("Given range :"+a);
		System.out.println("Given size :"+b);
		
	}
	
	public static void main(String[] args) 
	{
		details();
		System.out.println("Given percentage :"+c);
		

	}

}
