
class Employee
{
int Id;
String Name;
double Salary;
	
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
	Employee e1,e2;
	e1=new Employee();
	e1.setId(101);
	e1.setName("shruti");
	e1.setSalary(55000.00);

	e2=new Employee();
	e2.setId(102);
	e2.setName("Pragati");
	e2.setSalary(59000.00);

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
