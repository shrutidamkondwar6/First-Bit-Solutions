void main() {
	int num1=30,num2=20,result;
	char operator='/';
	if(operator=='+') {
		result=num1+num2;
		printf(" Addition=%d",result);
	} else {
		if(operator=='-') {
			result=num1-num2;
			printf("Substraction =%d",result);
		} else {
			if(operator=='*') {
				result=num1*num2;
				printf("Multiplication=%d",result);
			} else {
				if(operator=='/') {
					result= num1/num2;
					printf("Divide=%d",result);
				} else {
					if(operator=='%') {
						result=num1%num2;
						printf("Mod=%d",result);
					}
				}

			}
		}
	}
}