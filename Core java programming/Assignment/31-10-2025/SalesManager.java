
class SalesManager
{
int Id;
String Name;
double Salary,Incentive,Target;
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
}
}//class SalesManager ends here

class SalesManagerTest
{
public static void main (String [] args)
{
SalesManager s1;
s1=new SalesManager();
s1.setId(101);
s1.setName("Sapna");
s1.setSalary(87000.00);
s1.setIncentive(4000.00);
s1.setTarget(3000.00);
System.out.println("Id:"+s1.Id+"/Name:"+s1.Name+"/Salary:"+s1.Salary+"/Incentive:"+s1.Incentive+"/Target:"+s1.Target);
}
}//class Admin Test end here
