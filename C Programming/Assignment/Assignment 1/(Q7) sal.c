//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.
#include<stdio.h>
void main()
{
	double basic_sal=3500,da,ta,hra,total_sal;
	if(basic_sal<=5000)
	{
		da=basic_sal*0.10;
		ta=basic_sal*0.20;
		hra=basic_sal*0.25;
	}
	else
	{
    	da=basic_sal*0.15;
		ta=basic_sal*0.25;
		hra=basic_sal*0.30;	
	}
	total_sal=da+ta+hra;
	printf("total salary=%lf",total_sal);
}