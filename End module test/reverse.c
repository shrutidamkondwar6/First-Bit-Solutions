#include<stdio.h>
void rev(int);
void main()
{
 int no;
 printf("Enter a number");
 scanf("%d",&no);
  rev(no);	
}
void rev(int no)
{
	if(no==0)
	return;
	printf("%d",no%10);
	rev(no/10);
}