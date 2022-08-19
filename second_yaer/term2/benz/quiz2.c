#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    if ((c >= b) && (b >= a))
        printf("0");
    else
        printf("1");
    return 0;
}