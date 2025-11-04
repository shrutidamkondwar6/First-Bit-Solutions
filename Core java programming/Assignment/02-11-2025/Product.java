
class Product
{
int Pid,Quantity;
String Pname;
double Price;
	//setter method
	void setPid(int a)
	{
	this.Pid=a;
	}
	void setQuantity(int b)
	{
	this.Quantity=b;
	}
	void setPname(String c)
	{
	this.Pname=c;
	}
	void setPrice(double d)
	{
	this.Price=d;
	}//setter end here

		//getter method
		int getPid()
		{
		return this.Pid;
		}
		int getQuantity()
		{
		return this.Quantity;
		}
		String getPname()
		{
		return this.Pname;
		}
		double getPrice()
		{
		return this.Price;
		}//getter end here
	
	//display method
	void display()
	{
	System.out.println("ID is:"+ this.Pid);
	System.out.println("QUANTITY is:"+ this.Quantity);
	System.out.println("PRODUCT NAME is:"+ this.Pname);
	System.out.println("PRICE is:"+ this.Price);
	}//display end here

}//class Product ends here

class ProductTest
{
public static void main (String [] args)
	{
	Product p1,p2;
	p1=new Product();
	p1.setPid(1122);
	p1.setQuantity(500);
	p1.setPname("Almond");
	p1.setPrice(450.00);
	
	p2=new Product();
	p2.setPid(1025);
	p2.setQuantity(500);
	p2.setPname("Pista");
	p2.setPrice(800.00);

//System.out.println("Product_id:"+p1.Pid+"/Quantity:"+p1.Quantity+"/Product_name:"+p1.Pname+"/Product_price:"+p1.Price);

	if(p1.getPrice() > p2.getPrice())
	{
	System.out.println("p1 price is greater");
	}
	else
	{
	System.out.println("p2 price is greater");
	}
p1.display();
p2.display();


}
}//class Product Test end here
