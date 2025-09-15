//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
void main()
{
	int num=5,i=num,fact=1;
	while(i>1)
	{
		fact=fact*i;
		i--;
	}
	printf("factorial= %d is %d",num,fact);
}
