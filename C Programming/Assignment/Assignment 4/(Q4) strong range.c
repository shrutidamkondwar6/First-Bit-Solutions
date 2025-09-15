//Print strong numbers in the given range 1 to n.
#include<stdio.h>
void main()
{
	int num1,num2,no,rem,r1,b=0,fact,str=0;
	printf("enter  num1,enter num2 ");
	scanf("%d %d",&num1,&num2);
	for(;num1<=num2;num1++)
	{
		no=num1;
		for(;num1!=0;num1=num1/10)
		{
			fact=1;
			rem=num1%10;
			r1=rem;
			for(;r1!=b;r1--)
			{
				fact=fact*r1;
			}
			str=str+fact;
		}
		if(str==no)
		{
			printf("\n strong = %d",no);
		}
		num1=no;
		b=0;
		str=0;
	}
}
