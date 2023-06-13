
class A
{
	int c=29;
	double d=2.4;
	public void shivaa()
	{
		System.out.println("Given integer value :"+c);//29
		
	}
	
}
public class Nonstaticmethod extends A
{	
	int a=29;
	double b=2.4;
	public void shiva()
	{
		System.out.println("Given integer value :"+a);//29
		
	}

	public static void main(String[] args) 
	{
		//A S=new A();
		//S.shivaa();
		Nonstaticmethod nsm=new Nonstaticmethod();
		nsm.shiva();
		nsm.shivaa();
		System.out.println("Given number is float :"+nsm.b);
		System.out.println("Given number is float :"+nsm.d);

	}

}
