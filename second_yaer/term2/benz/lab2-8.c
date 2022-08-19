#include <stdio.h>
int main() {
    char fname1[150], sname1[150], person2[150], person3[150];
    scanf("%s %s" , fname1, sname1);
    scanf(" %[^\n]s", person2);
    scanf(" %[^\n]s", person3);
    printf("Person 1: %s %s\nPerson 2: %s\nPerson 3: %s", fname1, sname1, person2, person3);
}