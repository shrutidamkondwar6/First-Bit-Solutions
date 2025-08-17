//Print perfect numbers in the given range 1 to n.
#include<stdio.h>
void main()
{
	int num1,num2,i,sum=0;
	printf("enter  num1,enter num2 ");
	scanf("%d %d",&num1,&num2);
	for(i=1;i<num2 ; i++) 
	{
		sum=sum+i;
		if( sum>=num1&&sum<=num2)
		printf("\nperfect number=%d",sum);
	}
		
	
}