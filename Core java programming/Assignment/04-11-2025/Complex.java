
class Complex
{
	double Real,Imaginary;

Complex()//default constructor
{
System.out.println("default constructor");
this.Real=345.56;
this.Imaginary=343;
}
  
 Complex(double Real,double Imaginary)//parameterized constructor
{
System.out.println("parameterized constructor");
this.Real=Real;
this.Imaginary=Imaginary;
}


	//setter method
	void setReal(double a)
	{
	this.Real=a;
	}
  	void setImaginary(double b)
	{
	this.Imaginary=b;
	}//setter method ends here
		
		//getter method
		double getReal()
		{
		return this.Real;
		}
  		double getImaginary()
		{
		return this.Imaginary;
		}//getter method ends here

	//display method
	void display()
	{
	System.out.println("REAL NUMBER is:"+ this.Real);
        System.out.println("IMAGINARY NUMBER is:"+ this.Imaginary); 
	}//display ends here
		
}//class Complex ends here

class ComplexTest
{
public static void main (String [] args)
	{
	Complex c1,c2,c3,c4;
	c1=new Complex();
	c1.setReal(3.14);
	c1.setImaginary(3.0);

	c2=new Complex();
	c2.setReal(5.14);
	c2.setImaginary(6.54);

	c3=new Complex();
        c3.display();

	c4=new Complex(2344.5,324);
	c4.display();


//System.out.println("Real number:"+c1.Real+"/Imaginary number:"+c1.Imaginary);

	if(c1.getImaginary() > c2.getImaginary())
	{
	System.out.println("c1 number is greater");
	}
	else
	{
	System.out.println("c2 number is greater");
	}
c1.display();
c2.display();
}
}//class ComplexTest end here
