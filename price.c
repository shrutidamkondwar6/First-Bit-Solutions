void main()
{
	char student;
	double price=400,total_p;
	if(student=='y')
	{
		if(price>500)
		{
		total_p=price-price*0.20;	
		}
		else
		{
				total_p=price-price*0.10;	
		}
	}
	else
	{
		if(price>600)
		{
				total_p=price-price*0.15;	
		}
		else
		{
				total_p=price-0;	
		}
	}
	printf("final price=%lf",total_p);
}