package assignment2;

//Create a Main class
public class Constructor 
{
	int x; 
	public Constructor () 
	{
		x = 5;  // Set the initial value for the class attribute x
	}

	public static void main(String[] args)
	{
		Constructor  myObj = new Constructor (); 
		System.out.println(myObj.x); 
	}
}
