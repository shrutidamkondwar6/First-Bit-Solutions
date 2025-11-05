
class Admin
{
int Id;
String Name;
double Salary,Allowance;

Admin()//default constructor
{
System.out.println("default constructor");
this.Id=110;
this.Name="Shruti";
this.Salary=76000;
}
Admin(int Id,String Name,double Salary,double Allowance)//Parameterized constructor
{
System.out.println("Parameterized constructor");
this.Id=Id;
this.Name=Name;
this.Salary=Salary;
this.Allowance=Allowance;
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
	void setAllowance(double B)
	{
	this.Allowance=B;
	}//setter method ends here
		
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
		double setAllowance()
		{
		return this.Allowance;
		}//getter method ends here

	//display method
	void display()
	{
	System.out.println("ID is:"+ this.Id);
	System.out.println("NAME is:"+ this.Name);
	System.out.println("SALARY is:"+ this.Salary);
	System.out.println("ALLOWANCE is:"+ this.Allowance);
	}//display method ends here

}//class Admin ends here

class AdminTest
{
public static void main (String [] args)
	{
	Admin a1,a2,a3,a4;
	a1=new Admin();
	a1.setId(101);
	a1.setName("madhura");
	a1.setSalary(99000.00);
	a1.setAllowance(10000.00);

	a2=new Admin();
	a2.setId(102);
	a2.setName("divyani");
	a2.setSalary(55000.00);
	a2.setAllowance(5000.00);
 
	a3=new Admin();
	a3.display();

	a4=new Admin(111,"sneha",45676,3456);
	a4.display();

//System.out.println("Id:"+a1.Id+"/Name:"+a1.Name+"/Salary:"+a1.Salary+"/Allowance:"+a1.Allowance);

	if(a1.getSalary() > a2.getSalary())
	{
	System.out.println("a1 salary is greater");
	}
	else
	{
	System.out.println("a2 salary is greater");
	}
a1.display();
a2.display();
}
}//class Admin Test end here
