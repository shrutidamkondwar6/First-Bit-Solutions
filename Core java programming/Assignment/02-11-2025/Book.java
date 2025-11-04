
class Book
{
int ISBN;
String Bname,Category;
double Price;
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

//System.out.println("ISBN:"+b1.ISBN+"/Book_name:"+b1.Bname+"/Book_Category:"+b1.Category+"/Book_Price:"+b1.Price);

	if(b1.getPrice() > b2.getPrice())
	{
	System.out.println("b1 price is greater");
	}
	else
	{
	System.out.println("b2 price is greater");
	}
b1.display();
b2.display();
}
}//class Book Test end here
