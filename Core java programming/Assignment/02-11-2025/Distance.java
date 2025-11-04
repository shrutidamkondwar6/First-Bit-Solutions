
class Distance
{
int Km,M;
	//setter method
	void setKm(int x)
	{
	this.Km=x;
	}
	void setM(int y)
	{
	this.M=y;
	}
	//setter end here
		
		//getter method
		int getKm()
		{
		return this.Km;
		}
		int getM()
		{
		return this.M;
		} //getter end here

	//display method
	void display()
	{
	System.out.println("KILO METER is:"+ this.Km);
	System.out.println("METER is :"+ this.M);
	}
		
}//class Distance ends here

class DistanceTest
{
public static void main (String [] args)
	{
	Distance d1,d2;
	d1=new Distance();
	d1.setKm(12);
	d1.setM(500);

	
	d2=new Distance();
	d2.setKm(10);
	d2.setM(300);

        if(d1.getKm() > d2.getKm())
	{
	System.out.println("d1 Kilometer is larger");
	}
	else
	{
	System.out.println("d2 Kilometer is larger");
	}
d1.display();
d2.display();

//System.out.println("Kilometer:"+d1.Km+"/Meter:"+d1.M);
}
}//class Distance Test end here
