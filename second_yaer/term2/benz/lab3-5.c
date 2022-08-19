#include <stdio.h>
int main() {
    double num1, num2;
    scanf("%lf %lf", &num1, &num2);
    printf("Perimeter of rectangle = %.4lf units", (num1*2)+(num2*2));
}