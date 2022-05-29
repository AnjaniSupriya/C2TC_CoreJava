package assignment2;

public class ConsWithParameter 
{
	int num;
	public ConsWithParameter()
	{
		num=9;
	}
	public ConsWithParameter(int n)
	{
		num=7;
	}
	public static void main(String[] args)
	{
		ConsWithParameter obj=new ConsWithParameter();
		System.out.println("the value is "+obj.num);
	}
}
