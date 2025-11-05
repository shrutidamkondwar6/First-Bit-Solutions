
class Book
{
int ISBN;
String Bname,Category;
double Price;

Book()//default constructor
{
System.out.println("default constructor");
this.ISBN=110;
this.Bname="Shruti";
this.Category="grammer";
this.Price=850;
}
Book(int ISBN,String Bname,String Category,double Price)//Parameterized constructor
{
System.out.println("Parameterized constructor");
this.ISBN=ISBN;
this.Bname=Bname;
this.Category=Category;
this.Price=Price;
}
	//setter method
	void setISBN(int a)
	{
	this.ISBN=a;
	}
	void setBname(String b)
	{
	this.Bname=b;
	}
	void setCategory(String c)
	{
	this.Category=c;
	}
	void setPrice(double d)
	{
	this.Price=d;
	}//setter end here
		
		//getter method
		int getISBN()
		{
		return this.ISBN;
		}
		String getBname()
		{
		return this.Bname;
		}
		String getCategory()
		{
		return this.Category;
		}
		double getPrice()
		{
		return this.Price;
		}//getter end here
	
	//display method
	void display()
	{
	System.out.println("ISBN NUMBER is:"+ this.ISBN);
	System.out.println("BOOK NAME is:"+ this.Bname);
	System.out.println("BOOK CATEGORY is:"+ this.Category);
	System.out.println("BOOK PRICE is:"+ this.Price);
	}//display ends here
	

}//class Book ends here

class BookTest
{
public static void main (String [] args)
	{
	Book b1,b2;
	b1=new Book();
	b1.setISBN(10113);
	b1.setBname("Database Management System");
	b1.setCategory("DBMS");
	b1.setPrice(1025.00);
	
	b2=new Book();
	b2.setISBN(10115);
	b2.setBname("Prgoramming in C");
	b2.setCategory("Let us C");
	b2.setPrice(525.00);
Book b3;
	b3=new Book();
b3.display();

Book b4;
b4=new Book(111,"sneha","xyz",456.0);
b4.display();

//System.out.println("ISBN:"+b1.ISBN+"/Book_name:"+b1.Bname+"/Book_Category:"+b1.Category+"/Book_Price:"+b1.Price);

	if(b1.getPrice() > b2.getPrice())
	{
	System.out.println("\nb1 price is greater\n");
	}
	else
	{
	System.out.println("\nb2 price is greater\n");
	}
b1.display();
b2.display();
}
}//class Book Test end here
