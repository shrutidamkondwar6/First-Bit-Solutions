#include<stdio.h>
void main()
{
	int year=2000;
	if(year%4==0&&year%100!=0||year%400==0)
	{
		printf(" it is a leap year");
	}
	else{
		printf("it is not a leap year");
	}
}