#include <stdio.h> 

int main() {
    char a, b, c, d, e;
    scanf("%c %c %c %c %c", &a, &b, &c, &d, &e);
    printf("%c\n%c\n%c\n%c\n%c", a+1, b, c+1, d, e+1);
    return 0;
}