#include <stdio.h>
#include <math.h>

int main() {
    int sec, min, hour, day;
    scanf("%d", &sec);
    printf("%d s ", sec);
    min = floor(sec / 60);
    sec %= 60;
    hour = floor(min / 60);
    min %= 60;
    day = floor(hour / 24);
    hour %= 24;
    
    printf("= %d d %d h %d m %d s", day, hour, min, sec);
}