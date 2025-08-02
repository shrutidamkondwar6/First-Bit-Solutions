void main()
{
	int start=1,end=5,sum=0;
	while(start<=end)
	{
		sum=start+sum;
		start++;
	}
	printf("sum=%d\n",sum);
}