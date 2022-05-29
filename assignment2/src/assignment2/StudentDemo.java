package assignment2;

public class StudentDemo 
{

			public int min(int x, int y)
			{
				if(x<y)
					return x;
				else
					return y;
			}
			public static void main(String[] args) 
			{						
				StudentDemo obj=new StudentDemo();
				int b=obj.min(20,30);
				System.out.println("The number is "+b);
			}
}
