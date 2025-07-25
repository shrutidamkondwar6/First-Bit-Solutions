//Write a C program to swap two numbers using a temporary third variable.
void main()
{
	int a=10,b=20,temporary;
	temporary=a;
	a=b;
	b=temporary;
	printf("swap two number=a=%d b=%d ",a,b);
}