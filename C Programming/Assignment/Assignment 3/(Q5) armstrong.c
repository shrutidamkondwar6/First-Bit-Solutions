//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include<stdio.h>
void main()
{
	int no=153,r,sum=0,temp;
	temp=no;
	while(no!=0)
	{
		r=no%10;
		sum=sum+r*r*r;
		no=no/10;
	}
	if(sum==temp)
	{
		printf("no is armstrong");
	}
	else
	{
		printf("no is not a armstrong");
	}
}