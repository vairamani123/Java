package com.dedalus;


interface Android
{
	void showI();
}
class Oppo implements Android
{
	public void showI()
	{
		System.out.println("This is an Oppo Android!!");
	}
}
class Vivo implements Android
{
	public void showI()
	{
		System.out.println("This is a Vivo Android!!");
	}
}
class Samsung implements Android
{
	public void showI()
	{
		System.out.println("This is a Samsung Android!!");
	}
}

class IFactory 
{
	public Android getAndroid(String str)
	{
		if(str==null)
			return null;
		if(str.equalsIgnoreCase("Oppo"))
			return new Oppo();
		else if(str.equalsIgnoreCase("Vivo"))
			return new Vivo();
		else if(str.equalsIgnoreCase("Samsung"))
			return new Samsung();
		
		return null;
	}
}


class FactoryPattern
{
	public static void main(String args[])
	{
		
		IFactory iff=new IFactory();
		
		Android if1=iff.getAndroid("Oppo");
		if1.showI();
		Android if2=iff.getAndroid("Vivo");
		if2.showI();
		Android if3=iff.getAndroid("Samsung");
		if3.showI();
		
	}
}
