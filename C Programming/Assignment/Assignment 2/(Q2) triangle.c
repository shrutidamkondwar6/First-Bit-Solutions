//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
void main()
{
    int a=30,b=30,c=30;
 
	if(a==b && b==c  )
	{
		printf("equilateral");
	}
	else
	{
		if(a==b || b==c || a==c)
		{
			printf("isosceles");
		}
		else
		{
			printf("scalane");
		}
	}
 
}