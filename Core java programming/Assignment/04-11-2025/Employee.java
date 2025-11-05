
class Employee
{
int Id;
String Name;
double Salary;
	

Employee()//default constructor
{
System.out.println("default constructor");
this.Id=110;
this.Name="neha";
this.Salary=85789;
}

Employee(int Id,String Name,double Salary)//Parameterized constructor
{
System.out.println("Parameterized constructor");
this.Id=Id;
this.Name=Name;
this.Salary=Salary;
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
	void setSalary(double z)
	{
	this.Salary=z;
	}//setter method end here

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
		}//getter method end here

	//display method
	void display()
	{
	System.out.println("ID is:"+ this.Id);
	System.out.println("NAME is:"+ this.Name);
	System.out.println("SALARY is:"+ this.Salary);
	}//display ends here
}//Employee ends here

class EmployeeTest
{
public static void main (String [] args)
	{
	Employee e1,e2,e3,e4;
	e1=new Employee();
	e1.setId(101);
	e1.setName("shruti");
	e1.setSalary(55000.00);

	e2=new Employee();
	e2.setId(102);
	e2.setName("Pragati");
	e2.setSalary(59000.00);
	
	e3=new Employee();
	e3.display();

	e4=new Employee(233,"mansi",345675);
	e4.display();
	

//System.out.println("Id:"+e1.Id+"/Name:"+e1.Name+"/Salary:"+e1.Salary);

	if(e1.getSalary() > e2.getSalary())
	{
	System.out.println("e1 salary is greater");
	}
	else
	{
	System.out.println("e2 salary is greater");
	}
e1.display();
e2.display();
}
}//Employee Test end here
