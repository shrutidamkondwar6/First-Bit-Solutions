#include<stdio.h>
void main()
{
	int num=123,rev;
	int r1,r2,r3,q1;
	r1=num%10;
	q1=num/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	
	if(num==rev)
	{
		printf("number is palindrome");
	}
	else{
		printf("number is not a palindrome");
	}
}