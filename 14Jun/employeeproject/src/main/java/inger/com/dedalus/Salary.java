package inger.com.dedalus;

public class Salary {
	
	double basic;
	double hra;
	double da;
	double pf;
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", hra=" + hra + ", da=" + da + "]";
	}
  
	public void Calculatehradapf(double basic)
	{
	this.basic = basic;	
	this.hra = this.basic * 10/100;
	this.da = this.basic * 2/100;
	this.pf = this.basic * 1/100;
	}
}
