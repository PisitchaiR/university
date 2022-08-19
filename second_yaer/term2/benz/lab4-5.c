#include <stdio.h>

int main() {
    char word;
    scanf("%c", &word);

    if ((word >= 97) && (word < 123))
        printf("%c", word - 32);

    else if ((word >= 65) && (word < 91))
        printf("%c", word + 32);

    else
        printf("error");
    return 0;
}