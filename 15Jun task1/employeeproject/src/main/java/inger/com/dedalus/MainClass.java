package inger.com.dedalus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import inger.com.dedalus.Salary;
@Configuration
class employee 
{
	@Autowired
	Salary sal = new Salary();
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Value("101")
	private int empNo;
	@Value("vairam")
	private String empName;
	
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
		System.out.println("Net Salary " + ((sal.getBasic()+sal.da+sal.hra) - sal.pf));
	}
	
	
	public String toString() {
		return "employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	
	public void getDetails()
	{
		System.out.println("Employee inromation" + empNo + "  " + empName  + sal);
	}
}

@Configuration
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
		
		//Manager mng = new Manager(70000);
		
		
		
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("employee.xml");
		employee emp = (employee) context1.getBean("employee");
		System.out.println("Employee no :" + emp.getEmpNo() + " Employee name :" + emp.getEmpName() + " Employee basic :" + emp.getSal().getBasic());
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Manager mng = (Manager) context.getBean("manager");
		mng.calculateNet();
	/*	 context1 = new ClassPathXmlApplicationContext("employee.xml");
		employee mng = (employee) context1.getBean("mng");
		mng.calculateNet();
		mng.getDetails();*/
		//mng.calculateNet();
		//mng.getDetails();
		
		
		
		
		
		
		
				

	}

}
