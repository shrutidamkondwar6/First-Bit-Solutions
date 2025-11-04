 

class Car
{
	String Model,Brand,Color;
	double Price,FuelCapacity;

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
			void setPrice(int d)
			{
			this.Price=d;
			}
			void setFuelCapacity(int e)
			{
			this.FuelCapacity=e;
			}
}//class Car ends here

class CarTest
{
public static void main (String [] args)
{
Car c1;
c1=new Car();
c1.setModel("sport");
c1.setBrand("suzuki");
c1.setColor("Black");
c1.setPrice(80000);
c1.setFuelCapacity(5000);

System.out.println("Model:"+c1.Model+"/Brand:"+c1.Brand+"/Color:"+c1.Color+"/Price:"+c1.Price+"/Fuelcapacity:"+c1.FuelCapacity);
}
}//class CarTest end here
