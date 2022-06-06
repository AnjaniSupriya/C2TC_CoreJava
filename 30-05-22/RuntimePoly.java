package practice;

class RuntimePoly extends Runpoly 
	{
			public void show()
			{
				System.out.println("this is a child class");
			}
			public static void main(String[] args)
			{
				RuntimePoly obj=new RuntimePoly();
				obj.show();
			}
	}	

