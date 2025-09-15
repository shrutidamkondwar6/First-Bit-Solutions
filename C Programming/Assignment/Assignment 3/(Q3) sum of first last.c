//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
#include<stdio.h>
void main()
{
	int num=12345,ld,fd,sum;
	ld=num%10;
	while(num>0)
	{
		fd=num%10;
		num=num/10;
	}
	sum=ld+fd;
   printf(" sum of fd and ld = %d",sum);	
}