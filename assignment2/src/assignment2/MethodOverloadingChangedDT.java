package assignment2;

public class MethodOverloadingChangedDT
{
	static int add(int a,int b)
	{
		return a+b;
	}  
	static double add(double a,double b,int c)
	{
		return a+b+c;
	}  
	public static void main(String[] args)
	{  
	System.out.println(MethodOverloadingChangedDT.add(11,11));  
	System.out.println(MethodOverloadingChangedDT.add(12.1,11.2,11));  
	}
}  