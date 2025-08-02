void main() 
{
	int no=15;

	if(no%3==0 || no%5==0)
	 {
		if(no%3==0 && no%5==0) 
		{
			printf("divisible by both");
		} else 
		{
			if(no%3==0 && no%5!=0) 
			{
				printf("divisible by 3 but not by 5");
			} else 
			{
				if(no%3!=0 && no%5==0) 
				{
					printf("divisible by 5 but not by 3");
				}
			}
		}
		
		
	} else
			 {
				printf("Divisible by none");
	}
}