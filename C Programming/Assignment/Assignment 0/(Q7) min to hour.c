//Write a C program to convert given minutes into hours and remaining minutes.
void main()
{
	int total_min=90,hour,min;
	//int sec;
    hour=total_min/60;
    min=total_min%60;
   // sec=total_min*60;
	printf("hour=%d",hour);
	printf("min=%d",min);
	//printf("sec=%d",sec);
	
}