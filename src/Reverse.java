
public class Reverse {

	public static void main(String[] args)
	{
		int num=121,rev=0,rem,tem=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		
			System.out.println("reverse numer"+rev);
			if(tem==rev)
			{
				System.out.println("Given number is palindrome");
			}
			else
			{
				System.out.println("Given number is not palindrome");
			}
	}
	

}
