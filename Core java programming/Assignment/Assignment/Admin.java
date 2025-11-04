
class Admin
{
int Id;
String Name;
double Salary,Allowance;
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
}
}//class Admin ends here

class AdminTest
{
public static void main (String [] args)
{
Admin a1;
a1=new Admin();
a1.setId(101);
a1.setName("Pragati");
a1.setSalary(80000.00);
a1.setAllowance(5000.00);
System.out.println("Id:"+a1.Id+"/Name:"+a1.Name+"/Salary:"+a1.Salary+"/Allowance:"+a1.Allowance);
}
}//class Admin Test end here
