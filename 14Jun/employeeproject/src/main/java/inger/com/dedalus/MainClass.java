package inger.com.dedalus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import inger.com.dedalus.Salary;
class employee 
{
	int empNo;
	String empName;
	Salary sal = new Salary();
	public  employee()
	{
		
	}
	public employee(double basic)
	{
		empNo=101;
		empName = "Vairamuthu";
		sal.Calculatehradapf(basic);
	}
	
	public void calculateNet()
	{
		System.out.println("Net Salary " + ((sal.basic+sal.da+sal.hra) - sal.pf));
	}
	
	
	public String toString() {
		return "employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	
	public void getDetails()
	{
		System.out.println("Employee inromation" + empNo + "  " + empName  + sal);
	}
}

class Manager extends employee
{
	public Manager()
	{
	
	}
	public Manager(double basic)
	{
		super(basic);
	}
      String depart = "IT";
      
    		  
    		  public void getDetails()
    		  { 
    			  super.toString();
    			  System.out.println("Employee Department" + depart);
    			  
    		  }
    		  
    		  public void myMethod()
    		  {
    		  
    		  }
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager emp = new Manager(70000);
		emp.calculateNet();
		emp.getDetails();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Manager mng = (Manager) context.getBean("mng");
		mng.calculateNet();
		mng.getDetails();
		
		
		
		
		
				

	}

}
