package assignment1;

public class Code18 
{
	public static void main(String[]args)
	{
		for(int i=1,j=1;i<10||j<10;i++,j++)
		{
			j++;
			System.out.println("i="+i+"and j="+j);
		}
		//while loop
		int i=1,j=1;
		while(i<10||j<10)
		{
			i++;j++;
			System.out.println("i="+i+" and j="+j);
		}
		//do while loop
		int S=1,R=1;
		do
		{
			i++;
			j++;
			System.out.println("i="+i+" and j="+j);
		}while(i<10||j<10);
}	
}