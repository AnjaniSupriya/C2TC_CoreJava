package assignment2;


public class ConstructorWithParameter 
{
	int num;
	public ConstructorWithParameter()
	{
		num=9;
	}
	public ConstructorWithParameter(int n)
	{
		num=7;
	}
	public static void main(String[] args)
	{
		ConsWithParameter obj=new ConsWithParameter(9);
		System.out.println("the value is "+obj.num);
	}
}
