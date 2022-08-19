#include <stdio.h>
int main()
{
    char name[30], sname[30], num[8];
    int day, month, year;
    float gpa;
    scanf("%s %s %s %d/%d/%d %f", name, sname, num, &day, &month, &year, &gpa);
    printf("Fullname: %s %s\nID: %s\nDOB: %02d-%02d-%04d\nGPA: %.2f", name, sname, num, day, month, year, gpa);
    return 0;
}