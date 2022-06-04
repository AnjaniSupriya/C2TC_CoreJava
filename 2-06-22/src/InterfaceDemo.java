interface A1
{
	void display();
	
}
interface B1
{
	void display1();
	
}
public class InterfaceDemo implements A1,B1
{
	public void display()
	{
		System.out.println("in interface A");
	}
	public void display1()
	{
		System.out.println("in interface B");
	}
	public static void ain(String[] args) 
	{
		InterfaceDemo obj=new InterfaceDemo();
		obj.display();
		obj.display1();
	}
	
}
