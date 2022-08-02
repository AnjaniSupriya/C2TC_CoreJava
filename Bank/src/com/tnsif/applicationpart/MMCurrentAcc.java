package com.tnsif.applicationpart;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	public void mmcurrentacc(int accno, String accname, float accbal) {

		// TODO Auto-generated constructor stub
	}
	public float deliverycharges=50;
	public void gsnormalacc(int accno, String accname, float accbal, float creditlimit) {
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float minbal)
	{
		String creditlimit = null;
		System.out.println("Dear account user your currentaccount balance is" +minbal+ "with creditlimit"+creditlimit);
	}
	@Override
	public String toString() {
		String creditlimit = null;
		String accno = null;
		String accname = null;
		String accbal = null;
		return "mmcurrentacc [deliverycharges=" + deliverycharges + ", creditlimit=" + creditlimit + ", accno=" + accno
				+ ", accname=" + accname + ", accbal=" + accbal + "]";
	}

	
}