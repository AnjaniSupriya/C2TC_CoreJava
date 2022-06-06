package practice;
class car
{
	public void VehicleType()
	{
		System.out.println("Maruti");
	}
}

class maruti extends car
{
	public void speed()
	{
		System.out.println("The Speed is 120");
	}
}

class maruti800 extends maruti
{
	public void mileage()
	{
		System.out.println("The mileage is 25 per 100 km");
	}
}

public class CarDemo extends maruti800
{
	public static void main(String[] args)
	{
		CarDemo obj=new CarDemo();
		obj.speed();
		obj.mileage();
		obj.VehicleType();
	}
}
	






