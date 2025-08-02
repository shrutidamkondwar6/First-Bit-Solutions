void main()
{
	int num=250,r,sum=0,temp=num,i=1,fact;
	while(temp!=0)
	{
		fact=1;
		r=temp%10;
		while(i<=r)
		i++;
		{
			fact=fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(sum==num)
	{
		printf("no is strong number");
	}
	else
	{
		printf("no is not strong number");
	}
}