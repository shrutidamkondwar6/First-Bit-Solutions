
class HR
{
int Id;
String Name;
double Salary,Commission;
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
}
}//class HR ends here

class HRTest
{
public static void main (String [] args)
{
HR h1;
h1=new HR();
h1.setId(101);
h1.setName("Akshay");
h1.setSalary(96000.00);
h1.setCommission(6000.00);
System.out.println("Id:"+h1.Id+"/Name:"+h1.Name+"/Salary:"+h1.Salary+"/Commission:"+h1.Commission);
}
}//class HR Test end here
