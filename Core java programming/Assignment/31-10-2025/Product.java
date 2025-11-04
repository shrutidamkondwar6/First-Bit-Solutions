
class Product
{
int Pid,Quantity;
String Pname;
double Price;

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
}
}//class Product ends here

class ProductTest
{
public static void main (String [] args)
{
Product p1;
p1=new Product();
p1.setPid(1122);
p1.setQuantity(500);
p1.setPname("Almond");
p1.setPrice(450.00);
System.out.println("Product_id:"+p1.Pid+"/Quantity:"+p1.Quantity+"/Product_name:"+p1.Pname+"/Product_price:"+p1.Price);
}
}//class Product Test end here
