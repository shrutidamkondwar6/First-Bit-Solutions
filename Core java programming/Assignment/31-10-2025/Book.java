
class Book
{
int ISBN;
String Bname,Category;
double Price;

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
}

}//class Book ends here

class BookTest
{
public static void main (String [] args)
{
Book b1;
b1=new Book();
b1.setISBN(10113);
b1.setBname("Database Management System");
b1.setCategory("DBMS");
b1.setPrice(525.00);

System.out.println("ISBN:"+b1.ISBN+"/Book_name:"+b1.Bname+"/Book_Category:"+b1.Category+"/Book_Price:"+b1.Price);
}
}//class Book Test end here
