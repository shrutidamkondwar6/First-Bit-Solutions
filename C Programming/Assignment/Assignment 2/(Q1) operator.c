//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.
#include<stdio.h>
void main() {
	int num1=30,num2=20,result;
	char ope='*';
	if(ope=='+') {
		result=num1+num2;
		printf(" Addition=%d",result);
	} else {
		if(ope=='-') {
			result=num1-num2;
			printf("Substraction =%d",result);
		} else {
			if(ope=='*') {
				result=num1*num2;
				printf("Multiplication=%d",result);
			} else {
				if(ope=='/') {
					result= num1/num2;
					printf("Divide=%d",result);
				} else {
					if(ope=='%') {
						result=num1%num2;
						printf("Mod=%d",result);
					}
				}

			}
		}
	}
}