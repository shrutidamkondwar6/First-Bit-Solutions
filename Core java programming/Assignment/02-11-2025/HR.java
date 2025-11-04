
class HR
{
int Id;
String Name;
double Salary,Commission;
	
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
	void setCommission(double B)
	{
	this.Commission=B;
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
		double getCommission()
		{
		return this.Commission;
		}//getter method ends here

	//display method
	void display()
	{
	System.out.println("ID is:"+ this.Id);
	System.out.println("NAME is:"+ this.Name);
	System.out.println("SALARY is:"+ this.Salary);
	System.out.println("COMMISSION is:"+ this.Commission);
	}//display method ends here


}//class HR ends here

class HRTest
{
public static void main (String [] args)
	{
	HR h1,h2;
	h1=new HR();
	h1.setId(101);
	h1.setName("Akshay");
	h1.setSalary(96000.00);
	h1.setCommission(6000.00);

	h2=new HR();
	h2.setId(102);
	h2.setName("shrikant");
	h2.setSalary(55000.00);
	h2.setCommission(12000.00);
//System.out.println("Id:"+h1.Id+"/Name:"+h1.Name+"/Salary:"+h1.Salary+"/Commission:"+h1.Commission);

	if(h1.getCommission() > h2.getCommission())
	{
	System.out.println("h1 commission is greater");
	}
	else
	{
	System.out.println("h2 commission is greater");
	}
h1.display();
h2.display();
}
}//class HR Test end here
