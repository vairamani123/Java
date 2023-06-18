package inger.com.dedalus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Salary {
	@Value("90000")
	private double basic;
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

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
}
