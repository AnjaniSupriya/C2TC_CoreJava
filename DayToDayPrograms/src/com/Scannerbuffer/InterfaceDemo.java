package com.Scannerbuffer;
interface A
{
	void display();
	
}
interface B
{
	void display1();
	
}
public class InterfaceDemo implements A,B
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