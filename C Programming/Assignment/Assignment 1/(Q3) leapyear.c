//Write a program to check whether a given year is a leap year.
#include<stdio.h>
void main()
{
	int year=2024;
	if(year%4==0&&year%100!=0||year%400==0)
	{
		printf(" leap year");
	}
	else{
		printf(" not a leap year");
	}
}