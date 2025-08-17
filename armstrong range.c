//Print armstrong numbers in the given range 1 to n.
#include<stdio.h>
void main()
{
	int n;
	printf("enter a number");
	scanf("%d",&n);
	for ( int k=1;k<=n;k++)
	{
		int no=k;
		int temp=no;
		int count =0;
		while(no>0)
		{
			count++;
			no=no/10;
		}
		no=temp;
		int sum=0,rem;
		int res;
		while(no>0)
		{
			res=1;
			rem=no%10;
			for(int i=1;i<=count;i++)
			res=res*rem;
			
			sum=sum+res;
			no=no/10;
		}
		if(sum==temp)
		{
		 printf("%d is armstrong\n",temp);
		}
	}
}