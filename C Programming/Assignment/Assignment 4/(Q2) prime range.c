//Print prime numbers in the given range 1 to n.
#include<stdio.h>
void main() {
	int num1,num2,i;
	printf("enter  num1,enter num2 ");
	scanf("%d %d",&num1,&num2);
	for(; num1<=num2; num1++) {
		if(num1==1)
		{
			continue;
		}
		if (num1%2!=0&&num1%3!=0&&num1%5!=0&&num1%7!=0) {
		printf("prime number=%d\n",num1);
		} else {
			if(num1==2||num1==3||num1==5||num1==7)
				printf("prime number=%d\n",num1);
		}


	}

}