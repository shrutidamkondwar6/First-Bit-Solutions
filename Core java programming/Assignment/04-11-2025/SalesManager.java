
class SalesManager
{
  int Id;
  String Name;
  double Salary,Incentive,Target;

SalesManager()//default constructor
{
System.out.println("default constructor");
this.Id=110;
this.Name="Shruti";
this.Salary=85345;
this.Incentive=34567;
this.Target=345;
}

SalesManager(int Id,String Name,double Salary,double Incentive,double Target)//Parameterized constructor
{
System.out.println("Parameterized constructor");
this.Id=Id;
this.Name=Name;
this.Salary=Salary;
this.Incentive=Incentive;
this.Target=Target;
}
	//setter method
  	void setId(int x)
	{
	this.Id=x;
	}
	void setName(String y)
	{
	this.Name=y;
	}
	void setSalary(double A)
	{
	this.Salary=A;
	}
	void setIncentive(double B)
	{
	this.Incentive=B;
	}
	void setTarget(double c)
	{
	this.Target=c;
	}//setter end here
		
		//getter method
		int getId()
		{
		return this.Id;
		}
		String getName()
		{
		return this.Name;
		}
		double getSalary()
		{
		return this.Salary;
		}
		double getIncentive()
		{
		return this.Incentive;
	 	}
		double getTarget()
		{
		return this.Target;
		}//getter end here
	
	//display method
	void display()
	{
	System.out.println("ID is:"+ this.Id);
	System.out.println("NAME is:"+ this.Name);
	System.out.println("SALARY is:"+ this.Salary);
	System.out.println("INCENTIVE is:"+ this.Incentive);
	System.out.println("TARGET is:"+ this.Target);
	}
	
}//class SalesManager ends here

class SalesManagerTest
{
 public static void main (String [] args)
	{
	SalesManager s1,s2,s3,s4;
	s1=new SalesManager();
	s1.setId(101);
	s1.setName("Sapna");
	s1.setSalary(87000.00);
	s1.setIncentive(4000.00);
	s1.setTarget(3000.00);

	s2=new SalesManager();
	s2.setId(102);
	s2.setName("Dhananjay");
	s2.setSalary(89000.00);
	s2.setIncentive(5000.00);
	s2.setTarget(3000.00);

	s3=new SalesManager();
	s3.display();

	s4=new SalesManager(123,"siya",345651,675,234);
	s4.display();

//System.out.println("Id:"+s1.Id+"/Name:"+s1.Name+"/Salary:"+s1.Salary+"/Incentive:"+s1.Incentive+"/Target:"+s1.Target);
	if(s1.getSalary() > s2.getSalary())
	{
	System.out.println("s1 salary is greater");
	}
	else
	{
	System.out.println("s2 salary is greater");
	}
s1.display();
s2.display();
}
}//class Admin Test end here
