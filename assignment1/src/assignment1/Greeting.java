package assignment1;
import java.util.Scanner;
public class Greeting 
{
	String name;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter your name:");
		Scanner Sc = new Scanner(System.in);
		String name = Sc.next();
		System.out.println("Welcome, "+name);
		}

}
