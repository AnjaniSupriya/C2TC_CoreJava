public class DemoWrapperclass
{
		public static void main(String [] args)
		{
			int i=20;
			double d=9.34;
			//Boxing
					Integer iob=new Integer(i);
					System.out.println("this is autoboxing: " +iob);

			int j=iob;
			System.out.println("After Unboxing: " +j);
		}
	}

