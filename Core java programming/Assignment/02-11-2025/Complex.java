
class Complex
{
	double Real,Imaginary;

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
	Complex c1,c2;
	c1=new Complex();
	c1.setReal(3.14);
	c1.setImaginary(3.0);

	c2=new Complex();
	c2.setReal(5.14);
	c2.setImaginary(6.54);

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
