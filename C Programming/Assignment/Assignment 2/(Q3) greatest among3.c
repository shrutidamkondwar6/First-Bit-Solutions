//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
void main()
{
	int a=20,b=30,c=50;
	if(a>b)
	{
		if(a>c)
		{
			printf("a is greater");
		}
		else
		{
		printf("c is greater");	
		}
	}
	else
	{
		if(b>c)
		{
			printf("b is greater");
		}
		else
		{
			printf("c is greater");
		}
	}
}