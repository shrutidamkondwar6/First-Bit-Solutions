
class Employee
{
int Id;
String Name;
double Salary;
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
}
}//Employee ends here

class EmployeeTest
{
public static void main (String [] args)
{
Employee e1;
e1=new Employee();
e1.setId(101);
e1.setName("shruti");
e1.setSalary(55000.00);
System.out.println("Id:"+e1.Id+"/Name:"+e1.Name+"/Salary:"+e1.Salary);
}
}//Employee Test end here
