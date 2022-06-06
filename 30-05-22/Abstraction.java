package practice;

public class Abstraction extends Animal
{
		public void noise()
		{
		  System.out.println("The dog barks");
		}
		
		public static void main(String[] args) 
		{
			Abstraction a = new Abstraction();
			a.noise();
			a.eat();
		}
}
