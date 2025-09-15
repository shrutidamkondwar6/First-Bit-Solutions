 //Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong
#include<stdio.h>
 void main()
{
	int num=145,r,sum=0,temp=num,fact=1;
	while(temp!=0)
	{
		fact=1;
		r=temp%10;
		int i=1;
		while(i<=r)
		{
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(sum==num)
	{
		printf("no is strong number");
	}
	else
	{
		printf("no is not strong number");
	}
}