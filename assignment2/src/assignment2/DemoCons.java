package assignment2;

public class DemoCons 
{
	int num,num1;
	public DemoCons()
	{
		num=7;
		num1=9;
	}

	public static void main(String[] args)
	{
		DemoCons obj=new DemoCons();
		System.out.println("the value is"+obj.num);	
		System.out.println("the value is"+obj.num1);	
	}

}

