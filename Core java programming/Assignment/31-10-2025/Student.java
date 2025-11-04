
class Student
{
int Id;
String Name;
double Marks;
void setId(int x)
{
this.Id=x;
}
void setName(String y)
{
this.Name=y;
}
void setMarks(double z)
{
this.Marks=z;
}
}//class Student ends here

class StudentTest
{
public static void main (String [] args)
{
Student s1;
s1=new Student();
s1.setId(101);
s1.setName("Pragati");
s1.setMarks(85.00);
System.out.println("Id:"+s1.Id+"/Name:"+s1.Name+"/Marks:"+s1.Marks);
}
}//class Student Test end here
