//Write a C program to input marks of five subjects, find the total marks, and calculate
//the percentage.
void main()
{
	float sub1=70,sub2=60,sub3=90,sub4=80,sub5=100,marks,percentage;
	marks=sub1+sub2+sub3+sub4+sub5;
	percentage=marks*100;
	percentage=percentage/500;
	//percentage=marks/500*100;
	printf("marks=%f",marks);
printf("percentage=%f",percentage);
}