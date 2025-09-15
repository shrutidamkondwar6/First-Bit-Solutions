// Write a menu driven program to take a number for user and perform operations as follows.
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.
#include<stdio.h>
void main()
{
	int no;
	printf("enter the number");
	scanf("%d",&no);
printf("enter 1---- even odd\n");
printf("enter 2-----prime or not\n");
printf("enter 3-----pallindrome or not\n");
printf("enter 4-----positive,negative or zero\n");
printf("enter 5-----reverse a number\n");
printf("enter 6-----sum of digits\n");

   int choice;
   printf("Enter the choice");
   scanf("%d",&choice);
   //To check number is even or odd.
   if(choice==1)
   {
   if (no%2==0)
	{
		printf("number is even");
	}
	else
	{
		printf("number is odd");
	}
}
	//To check number is prime or not.
	else if (choice==2)
	{
	int i=2;
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
//To check number is pallindrome or not.
else if (choice==3)
{
	int rev;
	int r1,r2,r3,q1;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	if(no==rev)
	{
		printf("number is palindrome");
	}
	else{
		printf("number is not a palindrome");
	}
}
//To check number is positive, negative or zero.
else if (choice==4)
{
	if(no>0)
	{
		printf("number is positive");
	}
	else 
	if  (no<0)
	{
       printf("number is negative");
	}
	else{

		printf("number is neutral");
	}
}
//To reverse a number.
else if(choice==5)
{
	int rev;
	int r1,r2,r3,q1;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	rev==no;
	printf("reverse no=%d",rev);	
}
//To find sum of digits.
else if(choice==6)
{
int rem,sum=0;
while(no!=0)
{
	rem=no%10;
	sum=sum+rem;
	no=no/10;
}
printf("sum of digit=%d",sum);
}
}



