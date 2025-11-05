
class Student
{
int Rollno;
String Name;
double Marks;
	
Student()//default constructor
{
System.out.println("default constructor");
this.Rollno=110;
this.Name="Shruti";
this.Marks=85;
}

Student(int Rollno,String Name,double Marks)//Parameterized constructor
{
System.out.println("Parameterized constructor");
this.Rollno=Rollno;
this.Name=Name;
this.Marks=Marks;
}
	//setter method
	void setRollno(int x)
	{
	this.Rollno=x;
	}
	void setName(String y)
	{
	this.Name=y;
	}
	void setMarks(double z)
	{
	this.Marks=z;
	}//setter method end here

		//getter method
		int getRollno()
		{
		return this.Rollno;
		}
		String getName()
		{
		return this.Name;
		}
		double getMarks()
		{
		return this.Marks;
		}//getter method end here
	//display method
	void display()
	{
	System.out.println("ROLLNO is:"+ this.Rollno);
	System.out.println("NAME is:"+ this.Name);
	System.out.println("MARKS is:"+ this.Marks);
	}
		
}//class Student ends here

class StudentTest
{
public static void main (String [] args)
	{
	Student s1,s2,s3,s4;
	s1=new Student();
	s1.setRollno(101);
	s1.setName("Pragati");
	s1.setMarks(85.00);

	s2=new Student();
	s2.setRollno(102);
	s2.setName("Renuka");
	s2.setMarks(92.00);
 	
 	s3=new Student();
	s3.display();

 	s4=new Student(111,"xyz",76);
	s4.display();

//System.out.println("Id:"+s1.Id+"/Name:"+s1.Name+"/Marks:"+s1.Marks);

	
	if(s1.getMarks() > s2.getMarks())
	{
	System.out.println("s1 marks is greater");
	}
	else
	{
	System.out.println("s2 marks is greater");
	}
s1.display();
s2.display();
s3.display();

}
}//class Student Test end here
