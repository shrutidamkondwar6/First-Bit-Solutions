void main() {
	int age=12;
	if(age<12) {
		printf("Child");
	} else {
		if(age<12 || age<19) {
			printf("Teenager");
		} else {

			if(age<20 || age<59) {
				printf("Adult");
			}

			else {
				printf("Senior");
			}
		}
	}
}