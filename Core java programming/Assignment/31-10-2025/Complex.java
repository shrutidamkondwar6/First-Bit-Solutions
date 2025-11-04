
class Complex
{
	double Real,Imaginary;


		void setReal(double a)
		{
		this.Real=a;
		}
  		void setImaginary(double b)
		{
		this.Imaginary=b;
		}
		
}//class Complex ends here

class ComplexTest
{
public static void main (String [] args)
{
Complex c1;
c1=new Complex();
c1.setReal(3.14);
c1.setImaginary(3.0);

System.out.println("Real number:"+c1.Real+"/Imaginary number:"+c1.Imaginary);
}
}//class ComplexTest end here
