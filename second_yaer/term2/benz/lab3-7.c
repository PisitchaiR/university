#include <stdio.h>
int main() {
    double price, new_price, num, sale;
    scanf("%lf %lf %lf", &price, &new_price, &num);
    sale = price - (new_price/100*price);
    printf("%.2lf", (sale*num));
}