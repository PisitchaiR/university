#include <stdio.h>
#include <math.h>
int main()
{

    int num;
    double price, sale;
    scanf("%lf %lf %d", &price, &sale, &num);

    double result1, result2;
    result1 = (price * num) - ((price * sale * num) / 100);
    result2 = (floor(num / 3) * (price * 2)) + ((num % 3) * price);

    if (result1 <= result2)
        printf("Discount %.0f%%\n%.2f", sale, result1);

    else
        printf("Buy 2 Get 1\n%.2f", result2);
}