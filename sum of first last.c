 void main()
{
	int num=12345,ld,fd,sum;
	ld=num%10;
	while(num>0)
	{
		fd=num%10;
		num=num/10;
	}
	sum=ld+fd;
   printf(" sum of fd and ld %d",sum);	
}