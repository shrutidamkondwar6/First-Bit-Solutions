
#include <stdio.h>

void main() {
    int id;
    char name[50];
    double price, discount, final_price, gst;

    printf("Enter a Id ");
    scanf("%d", &id);

    printf("Enter a  name ");
    scanf("%s", name);  

    printf("Enter a  Price ");
    scanf("%lf", &price);

    if (price > 500) {
        discount = 0.20;
    } else {
        discount = 0.05;
    }
    discount = price * (1 - discount);
    gst = 0.18;
    final_price = discount * (1 + gst);
    
    printf("Id= %d\n", id);
    printf(" Name= %s\n", name);
    printf(" Price= %lf\n", price);
    printf("Final Price after 18%% GST: %.lf\n", final_price);
}