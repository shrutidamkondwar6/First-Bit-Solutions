//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void main()
{
int no=7,i=2;
while(i<no)
{
	if(no%i==0)
	{
		printf("no is not a prime");
		break;
	}
	i++;
	if(i==no)
	{
		printf("no is prime");
	}
	
}
}