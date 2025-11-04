 

class Car
{
String Model,Brand,Color;
double Price,FuelCapacity;
		
	//setter method
	void setModel(String a)
	{
	this.Model=a;
	}
  	void setBrand(String b)
	{
	this.Brand=b;
	}
	void setColor(String c)
	{
	this.Color=c;
	}
	void setPrice(double d)
	{
	this.Price=d;
	}
	void setFuelCapacity(double e)
	{
	this.FuelCapacity=e;
	}//setter method ends here
	
	
		//getter method
		String getModel()
		{
		return this.Model;
	  	}
  		String getBrand()
		{
		return this.Brand;
		}
		String getColor()
		{
		return this.Color;
		}
		double getPrice()
		{
		return this.Price;
		}
		double getFuelCapacity()
		{
		return this.FuelCapacity;
		}//getter method ends here

	//display method
	void display()
	{
	System.out.println("MODEL is:"+ this.Model);
	System.out.println("BRAND is:"+ this.Brand);
	System.out.println("COLOR is:"+ this.Color);
	System.out.println("PRICE is:"+ this.Price);
	System.out.println("FUEL CAPACITY is:"+ this.FuelCapacity);
	}//display ends here
	
		
}//class Car ends here

class CarTest
{
public static void main (String [] args)
	{
	Car c1,c2;
	c1=new Car();
	c1.setModel("sport");
	c1.setBrand("suzuki");
	c1.setColor("Black");
	c1.setPrice(800000);
	c1.setFuelCapacity(5000);

	c2=new Car();
	c2.setModel("Maruti");
	c2.setBrand("Honda");
	c2.setColor("Black");
	c2.setPrice(950000);
	c2.setFuelCapacity(7000);

//System.out.println("Model:"+c1.Model+"/Brand:"+c1.Brand+"/Color:"+c1.Color+"/Price:"+c1.Price+"/Fuelcapacity:"+c1.FuelCapacity);

	if(c1.getPrice() > c2.getPrice())
	{
	System.out.println("c1 price is greater");
	}
	else
	{
	System.out.println("c2 price is greater");
	}
c1.display();
c2.display();
}
}//class CarTest end here
